/**
 * 
 */
package com.lancope.packet.capture;

import net.sourceforge.jpcap.capture.PacketListener;
import net.sourceforge.jpcap.net.Packet;
import net.sourceforge.jpcap.net.UDPPacket;

/**
 * @author GhazniNattarshah
 *
 */
public class UDPPacketListener implements PacketListener {

	private static int packetReceived = 0;

	@Override
	public void packetArrived(Packet packet) {

		if (packet instanceof UDPPacket) {

			UDPPacket udpPacket = (UDPPacket) packet;
			byte[] data = udpPacket.getData();

			String srcHost = udpPacket.getSourceAddress();
			String destHost = udpPacket.getDestinationAddress();
			int srcPort = udpPacket.getSourcePort();
			int destPort = udpPacket.getSourcePort();

			int checksum = udpPacket.getChecksum();
			//String isoData = new String(data, "ISO-8859-1");
			
			System.out.println(packetReceived + " ~ " +srcHost + ": " + srcPort  + " -> " + destHost + ": " + destPort + " -- checksum " + checksum + "[" + udpPacket.toColoredString(false) + "]");

			packetReceived++;
			//System.out.println(packetReceived);
		}
	}
}
