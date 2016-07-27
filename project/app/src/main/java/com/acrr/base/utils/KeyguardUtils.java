/*
 * Copyright (C) 2015 AChep@xda <artemchep@gmail.com>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA  02110-1301, USA.
 */
package com.acrr.base.utils;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.Context;
import android.support.annotation.NonNull;

import com.acrr.base.Device;

/**
 * @author Artem Chepurnoy
 */
public class KeyguardUtils {

    /**
     * Returns whether the device is currently locked and requires a PIN,
     * pattern or password to unlock.
     */
    @SuppressLint("NewApi")
    public static boolean isDeviceLocked(@NonNull Context context) {
        KeyguardManager km = (KeyguardManager) context.getSystemService(Context.KEYGUARD_SERVICE);
        return isDeviceLocked(km);
    }

    /**
     * Returns whether the device is currently locked and requires a PIN,
     * pattern or password to unlock.
     */
    @SuppressLint("NewApi")
    public static boolean isDeviceLocked(@NonNull KeyguardManager km) {
        return Device.hasLollipopMR1Api() ? km.isDeviceLocked() : km.isKeyguardSecure();
    }

}