/**
 *  Sync Nest Mode
 *
 *  Author: Oliver Ratzesberger
 *  Date: 8/31/14
 *
 *  Simply keeps thermostats (specifically NEST) in sync with the Home mode
 *  thermostat).  This is intended to be used with an "Away" or "Home" mode.
 */

definition(
    name:        "Sync Nest Mode",
    namespace:   "fxstein",
    author:      "Oliver Ratzesberger",
    description: "Sync up thermostat to Home modes. Simply marks any thermostat 'away' if able (primarily focused on the Nest thermostat).  This is intended to be used with an 'Away' or 'Home' mode.",
    category:    "Green Living",
    iconUrl:     "https://s3.amazonaws.com/smartthings-device-icons/Home/home1-icn.png",
    iconX2Url:   "https://s3.amazonaws.com/smartthings-device-icons/Home/home1-icn@2x.png"
)

preferences {
    section("Select Thermostats to keep in sync with Home mode:") {
    input "thermostats", "capability.thermostat", multiple: true
  }
}
