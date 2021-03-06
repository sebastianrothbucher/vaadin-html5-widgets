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
package de.sebastianrothbucher.vaadin.html5.widgetset.client;

import com.vaadin.client.ui.VTextField;

public class NumberFieldWidget extends VTextField {

	public static final String CLASSNAME = "v-numberfield";

	public NumberFieldWidget() {
		addStyleName(CLASSNAME);
		getElement().setPropertyString("type", "number");
	}

	public void setMin(Integer min) {
		if (min == null) {
			getElement().setPropertyString("min", "");
		} else {
			getElement().setPropertyString("min", min.toString());
		}
	}

	public void setMax(Integer max) {
		if (max == null) {
			getElement().setPropertyString("max", "");
		} else {
			getElement().setPropertyString("max", max.toString());
		}
	}

	public void setStep(Integer step) {
		if (step == null) {
			getElement().setPropertyString("step", "");
		} else {
			getElement().setPropertyString("step", step.toString());
		}
	}

}