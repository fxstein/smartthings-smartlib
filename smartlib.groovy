/**
 *  SmartLib
 *
 *  Copyright 2014 Oliver Ratzesberger
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
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

// TODO: implement event handlers
