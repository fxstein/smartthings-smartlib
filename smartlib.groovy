/**
 *	SmartLib
 *
 *	Copyright 2014 Oliver Ratzesberger
 *
 *	Common functions Library for SMartThings Apps and device drivers
 *
 *	Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *	in compliance with the License. You may obtain a copy of the License at:
 *
 *			http://www.apache.org/licenses/LICENSE-2.0
 *
 *	Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *	on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *	for the specific language governing permissions and limitations under the License.
 *
 */
definition(
		name: "SmartLib",
		namespace: "fxstein",
		author: "Oliver Ratzesberger",
		description: "SmartLib extension library for SmartThings",
		category: "SmartThings Labs",
		iconUrl: "https://raw.githubusercontent.com/fxstein/smartthings-smartlib/master/smartlib.png",
		iconX2Url: "https://raw.githubusercontent.com/fxstein/smartthings-smartlib/master/smartlib@2x.png")


preferences {
	section("Title") {
		// TODO: put inputs here
	}
}

def installed() {
	log.debug "Installed with settings: ${settings}"

	initialize()
}

def updated() {
	log.debug "Updated with settings: ${settings}"

	unsubscribe()
	initialize()
}

def initialize() {
	// TODO: subscribe to attributes, devices, locations, etc.
}

//
// IP Address conversion helpers
//

// Unfortunately needed helpers to work with HubAction - Thanks to @pstuart
public String convertIPtoHex(ipAddress) {
	// Must do 2 digit hex padding or 10.x.x.x addresses will not work
	String hexIp = ipAddress.tokenize( '.' ).collect {	String.format( '%02x', it.toInteger() ) }.join()
	log.debug "IP address entered is $ipAddress and the converted hexIp code is $hexIp"
	return hexIp
}

public String convertPortToHex(port) {
	// Must do 4 digit hex padding or 2 digit ports like 80 will not work
	String hexPort = port.toString().format( '%04x', port.toInteger() )
	log.debug "Port entered is $port and the converted hex code is $hexPort"
	return hexPort
}

// Take IP:Port format and convert to correspondig HEX format for the ST Hub
public String convertAddrToHex(deviceAddress) {

	def parts = deviceAddress.split(":")
	def iphex = convertIPtoHex(parts[0])
		// TODO: Should add handling for addresses without port specified and default to e.g. 80
	def porthex = convertPortToHex(parts[1])

	def hexAddr = "$iphex:$porthex"
	log.debug "Device address entered is $deviceAddress and the converted hexAddr code is $hexAddr"
	return hexAddr
}
