/**
 * 
 */
package com.lancope.packet.capture;

import net.sourceforge.jpcap.capture.PacketCapture;


/**
 * @author Ghazni Nattarshah
 *
 */
public class TestUDPPacketGrabber {

	public static void main(String[] args) throws Exception {

		System.load("E:\\dev\\prototypes\\java\\packet.capture\\jpcap.dll");

		String[] devices = UDPPacketGrabber.discoverDevices();
		
//		PacketCapture cap = new PacketCapture();
//		cap.addPacketListener(new UDPPacketListener());
//		cap.open("\\Device\\NPF_{60BB1B57-C7C2-4E71-A00F-C1DA5D570557}", false);
//		cap.setFilter("", true);
//		String dev = cap.findDevice();

		UDPPacketGrabber.grab("\\Device\\NPF_{60BB1B57-C7C2-4E71-A00F-C1DA5D570557}");
		
		//System.out.println(UDPPacketGrabber.getPacketCount());
	}
}
