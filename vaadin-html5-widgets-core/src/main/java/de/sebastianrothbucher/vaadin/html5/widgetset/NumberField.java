/*
 * The MIT License (MIT)
 * 
 * Copyright (c) 2014 Sebastian Rothbucher
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package de.sebastianrothbucher.vaadin.html5.widgetset;

import com.vaadin.data.Property;
import com.vaadin.ui.TextField;

import de.sebastianrothbucher.vaadin.html5.widgetset.client.NumberFieldState;

public class NumberField extends TextField {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NumberField() {
		super();
	}

	public NumberField(Property<?> dataSource) {
		super(dataSource);
	}

	public NumberField(String caption, Property<?> dataSource) {
		super(caption, dataSource);
	}

	public NumberField(String caption, String value) {
		super(caption, value);
	}

	public NumberField(String caption) {
		super(caption);
	}

	@Override
	protected NumberFieldState getState() {
		return (NumberFieldState) super.getState();
	}

	/**
	 * @return the minimum number to be entered (or null for any number)
	 */
	public Integer getMin() {
		return getState().min;
	}

	/**
	 * @param min
	 *            the minimum number to be entered (or null for any number)
	 */
	public void setMin(Integer min) {
		getState().min = min;
	}

	/**
	 * @return the maximum number to be entered (or null for any number)
	 */
	public Integer getMax() {
		return getState().max;
	}

	/**
	 * @param max
	 *            the maximum number to be entered (or null for any number)
	 */
	public void setMax(Integer max) {
		getState().max = max;
	}

	/**
	 * @return the step for the number to be entered (or null for any number)
	 */
	public Integer getStep() {
		return getState().step;
	}

	/**
	 * @param step
	 *            the step for the number to be entered (or null for any number)
	 */
	public void setStep(Integer step) {
		getState().step = step;
	}

}
