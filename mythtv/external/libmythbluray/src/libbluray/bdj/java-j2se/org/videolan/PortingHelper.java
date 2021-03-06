/*
 * This file is part of libbluray
 * Copyright (C) 2013  Petri Hintukainen <phintuka@users.sourceforge.net>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library. If not, see
 * <http://www.gnu.org/licenses/>.
 */

package org.videolan;

public class PortingHelper {

    public static void stopThread(Thread t) {
        t.stop();
    }

    public static void stopThreadGroup(ThreadGroup t) {
        t.stop();
    }

    public static String dumpStack(Thread t) {
        StackTraceElement e[] = t.getStackTrace();
        if (e != null) {
            StringBuffer dump = new StringBuffer();
            for (int i = 0; i < e.length; i++) {
                dump.append("\n\t");
                dump.append(e[i].toString());
            }
            return dump.toString();
        }
        return "";
    }
}
