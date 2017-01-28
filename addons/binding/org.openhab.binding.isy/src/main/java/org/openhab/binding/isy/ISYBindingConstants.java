/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.isy;

import org.eclipse.smarthome.core.thing.ThingTypeUID;
import org.eclipse.smarthome.core.thing.type.ChannelTypeUID;

/**
 * The {@link ISYBinding} class defines common constants, which are
 * used across the whole binding.
 *
 * @author Jason Marchioni - Initial contribution
 */
public class ISYBindingConstants {

    public static final String BINDING_ID = "isy";

    // List of all Thing Type UIDs
    public final static ThingTypeUID THING_TYPE_ISY = new ThingTypeUID(BINDING_ID, "isy");
    public final static ThingTypeUID THING_TYPE_DIMMER = new ThingTypeUID(BINDING_ID, "dimmer");
    public final static ThingTypeUID THING_TYPE_SWITCH = new ThingTypeUID(BINDING_ID, "switch");
    public final static ThingTypeUID THING_TYPE_OUTLET = new ThingTypeUID(BINDING_ID, "outlet");
    public final static ThingTypeUID THING_TYPE_MOTION_SENSOR = new ThingTypeUID(BINDING_ID, "motionSensor");
    public final static ThingTypeUID THING_TYPE_CONTACT_SENSOR = new ThingTypeUID(BINDING_ID, "contactSensor");

    // List of all Channel ids
    public final static String CHANNEL_STATE = "state";
    public final static String CHANNEL_STATE_2 = "state2";
    public final static String CHANNEL_BRIGHTNESS = "brightness";
    public final static String CHANNEL_MOTION = "motion";
    public final static String CHANNEL_DUSK_DAWN = "duskDawn";
    public final static String CHANNEL_BATTERY = "battery";
    public final static String CHANNEL_CONTROL = "control";
    public final static String CHANNEL_SCENE = "scene";
    public final static String CHANNEL_STATE_VARIABLE = "stateVariable";

    public final static ChannelTypeUID CHANNEL_TYPE_SCENE = new ChannelTypeUID(BINDING_ID, CHANNEL_SCENE);
    public final static ChannelTypeUID CHANNEL_TYPE_STATE_VARIABLE = new ChannelTypeUID(BINDING_ID,
            CHANNEL_STATE_VARIABLE);

    // Upnp Discovery
    public static final String ISY = "ISY";
    public static final String UNIVERSAL_DEVICES_INC = "Universal Devices Inc.";

    // Parameters
    public static final String PARAMETER_USERNAME = "username";
    public static final String PARAMETER_PASSWORD = "password";
    public static final String PARAMETER_BASE_URL = "baseUrl";

    public static String addresstoId(String address) {
        int lastGap = address.lastIndexOf(" ");
        return address.substring(0, lastGap).replace(" ", "_");
    }

}
