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
package com.acrr.acdisplay.notifications;

import android.support.annotation.NonNull;

import com.acrr.base.Device;

/**
 * @author Artem Chepurnoy
 */
// TODO: Implement a basic spam filter.
public class NotificationSpamFilter {

    @NonNull
    public NotificationSpamFilter postNotification(@NonNull OpenNotification n) {
        if (Device.hasLollipopApi()) {
            // The spam filter probably will not support Lollipop
            // due to its complexity.
            return this;
        }
        return this;
    }

    /**
     * @return {@code true} if the notification is not a spam, and may be shown to
     * user, {@code false} otherwise.
     */
    public boolean isValid(@NonNull OpenNotification n) {
        if (Device.hasLollipopApi()) {
            return true;
        }
        return true;
    }

}