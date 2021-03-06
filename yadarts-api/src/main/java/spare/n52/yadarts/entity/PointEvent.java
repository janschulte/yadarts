/**
 * Copyright 2014 the staff of 52°North Initiative for Geospatial Open
 * Source Software GmbH in their free time
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package spare.n52.yadarts.entity;

/**
 * Interface for representing a common hit on the dart board
 */
public interface PointEvent extends InteractionEvent {

	/**
	 * @return the base number of the hit
	 */
	public int getBaseNumber();
	
	/**
	 * @return the multiplier ("Triple 20") of the hit
	 */
	public int getMultiplier();

	/**
	 * @return if the outer ring was hit
	 */
	boolean isOuterRing();

	/**
	 * @return the score value
	 */
	int getScoreValue();
	
}
