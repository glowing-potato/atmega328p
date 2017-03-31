package com.github.glowingpotato.atmega328p;

import Hack.HardwareSimulator.HardwareSimulatorApplication;
import SimulatorsGUI.HardwareSimulatorComponent;
import SimulatorsGUI.HardwareSimulatorControllerComponent;

public class Main {
	public static void main(String[] args) {
		new HardwareSimulatorApplication(new HardwareSimulatorControllerComponent(), new HardwareSimulatorComponent(),
				"bin/scripts/defaultHW.txt", "bin/help/hwUsage.html", "bin/help/hwAbout.html");
	}
}
