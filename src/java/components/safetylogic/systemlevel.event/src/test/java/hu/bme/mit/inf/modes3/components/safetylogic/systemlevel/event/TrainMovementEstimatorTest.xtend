package hu.bme.mit.inf.modes3.components.safetylogic.systemlevel.event

import hu.bme.mit.inf.modes3.messaging.messages.enums.SegmentOccupancy
import hu.bme.mit.inf.safetylogic.event.INotifiable
import hu.bme.mit.inf.safetylogic.event.ModelUtil
import hu.bme.mit.inf.safetylogic.event.TrainMovementEstimator
//import org.junit.Assert
//import org.junit.Before
//import org.junit.Test
import org.slf4j.helpers.NOPLoggerFactory
import org.slf4j.impl.SimpleLoggerFactory
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import static org.junit.jupiter.api.Assertions.assertEquals

class TrainMovementEstimatorTest {
	var static TrainMovementEstimator estimator
	var static ModelUtil modelUtil

	@BeforeAll
	def static void before() {
		modelUtil = new ModelUtil(new NOPLoggerFactory)
		estimator = new TrainMovementEstimator(
			modelUtil,
			new INotifiable() {
				override onUpdate() {
					// Left blank intentionally
				}
			},
			new SimpleLoggerFactory
		)
	}

	private def void move(int from, int to) {
		estimator.onSegmentOccupancyChange(to, SegmentOccupancy.FREE, SegmentOccupancy.OCCUPIED)
		Thread.sleep(200)
		estimator.onSegmentOccupancyChange(from, SegmentOccupancy.OCCUPIED, SegmentOccupancy.FREE)
	}

	@Test
	def void trainMovementEstimatorTest() {

		assertEquals(0, modelUtil.model.trains.size)

		estimator.onSegmentOccupancyChange(1, SegmentOccupancy.FREE, SegmentOccupancy.OCCUPIED)
		assertEquals(1, modelUtil.model.trains.size)
		assertEquals(1, modelUtil.model.trains.head.currentlyOn.id)

		move(1, 12)
		Thread.sleep(500)
		assertEquals(1, modelUtil.model.trains.size)
		assertEquals(12, modelUtil.model.trains.head.currentlyOn.id)

		move(12, 14)
		assertEquals(1, modelUtil.model.trains.size)
		//assertEquals(14, modelUtil.model.trains.head.currentlyOn.id)

		//move(14, 15)
		//assertEquals(1, modelUtil.model.trains.size)
		//TODO: Check Validity of: "the train will automatically move from turnout 14 to section 15"
		assertEquals(15, modelUtil.model.trains.head.currentlyOn.id)

		move(15, 24)
		assertEquals(1, modelUtil.model.trains.size)
		assertEquals(24, modelUtil.model.trains.head.currentlyOn.id)
	}
}
