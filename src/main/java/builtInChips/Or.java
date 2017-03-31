package builtInChips;

import Hack.Gates.BuiltInGate;

public class Or extends BuiltInGate {
	@Override
	protected void reCompute() {
		outputPins[0].set((short) (inputPins[0].get() + inputPins[1].get() > 0 ? 1 : 0));
	}
}
