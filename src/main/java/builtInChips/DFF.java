package builtInChips;

import Hack.Gates.BuiltInGate;

public class DFF extends BuiltInGate {
	private boolean value;
	
	@Override
	protected void reCompute() {
		if (inputPins[1].get() == 1) {
			value = inputPins[0].get() == 1;
		}
		outputPins[0].set((short) (value ? 1 : 0));
	}
}
