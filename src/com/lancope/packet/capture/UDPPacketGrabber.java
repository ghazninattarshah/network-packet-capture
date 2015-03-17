/**
 * 
 */
package com.lancope.packet.capture;

import net.sourceforge.jpcap.capture.PacketCapture;



/**
 * @author Ghazni Nattarshah
 *
 */
public class UDPPacketGrabber {

	private static final int INFINITE = -1;
	private static final int PACKET_COUNT = INFINITE; 

	public static String[] discoverDevices() throws Exception {
		return PacketCapture.lookupDevices();
	}

	public static void grab(String device) throws Exception {

		PacketCapture pcap = new PacketCapture();
	    System.out.println("Using device '" + device + "'");
	    pcap.open(device, true);
	    //Filter f = new Filter();
	    pcap.setFilter("", true);
	    pcap.addPacketListener(new UDPPacketListener());

	    System.out.println("Capturing packets...");
	    pcap.capture(PACKET_COUNT);
	}
	
	public static int getPacketCount() {
		return PACKET_COUNT;
	}
}
