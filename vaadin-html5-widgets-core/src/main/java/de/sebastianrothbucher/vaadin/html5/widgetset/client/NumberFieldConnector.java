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

import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.client.communication.StateChangeEvent;
import com.vaadin.client.ui.textfield.TextFieldConnector;
import com.vaadin.shared.ui.Connect;

@Connect(de.sebastianrothbucher.vaadin.html5.widgetset.NumberField.class)
public class NumberFieldConnector extends TextFieldConnector {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected Widget createWidget() {
		return GWT.create(NumberFieldWidget.class);
	}

	@Override
	public NumberFieldWidget getWidget() {
		return (NumberFieldWidget) super.getWidget();
	}

	@Override
	public NumberFieldState getState() {
		return (NumberFieldState) super.getState();
	}

	@Override
	public void onStateChanged(StateChangeEvent stateChangeEvent) {
		super.onStateChanged(stateChangeEvent);
		getWidget().setMin(getState().min);
		getWidget().setMax(getState().max);
		getWidget().setStep(getState().step);
	}

}