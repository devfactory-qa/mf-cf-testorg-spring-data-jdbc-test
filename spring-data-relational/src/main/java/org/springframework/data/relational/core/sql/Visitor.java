/*
 * Copyright 2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.relational.core.sql;

/**
 * AST {@link Segment} visitor. Visitor methods get called by segments on entering a {@link Segment}, their child {@link Segment}s and on leaving the {@link Segment}.
 *
 * @author Mark Paluch
 */
@FunctionalInterface
public interface Visitor {

	/**
	 * Enter a {@link Segment}.
	 *
	 * @param segment the segment to visit.
	 */
	void enter(Visitable segment);

	/**
	 * Leave a {@link Segment}.
	 *
	 * @param segment the visited segment.
	 */
	default void leave(Visitable segment) {

	}
}
