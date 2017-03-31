package builtInChips;

import Hack.Gates.BuiltInGate;

public class Not extends BuiltInGate {
	@Override
	protected void reCompute() {
		outputPins[0].set((short) (1 - inputPins[0].get()));
	}
}
