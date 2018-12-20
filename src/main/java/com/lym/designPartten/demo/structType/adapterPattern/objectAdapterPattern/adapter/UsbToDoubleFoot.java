package com.lym.designPartten.demo.structType.adapterPattern.objectAdapterPattern.adapter;

import com.lym.designPartten.demo.structType.adapterPattern.objectAdapterPattern.adaptee.Usb;
import com.lym.designPartten.demo.structType.adapterPattern.objectAdapterPattern.target.DoubleFoot;

public class UsbToDoubleFoot implements DoubleFoot{
	Usb usb;

	public UsbToDoubleFoot(Usb usb) {
		this.usb = usb;
	}
	
	@Override
	public void useDoubleFootCharge() {
		usb.useUsbCharge();
	}
	
}
