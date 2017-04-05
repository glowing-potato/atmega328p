package builtInChips;

import Hack.Gates.BuiltInGate;

public class Copy extends BuiltInGate {
	@Override
	protected void reCompute() {
		outputPins[0].set(inputPins[0].get());
	}
}
