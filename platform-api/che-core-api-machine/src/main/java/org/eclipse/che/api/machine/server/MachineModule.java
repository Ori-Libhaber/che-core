/*******************************************************************************
 * Copyright (c) 2012-2015 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package org.eclipse.che.api.machine.server;

import com.google.inject.AbstractModule;

import org.eclipse.che.api.machine.server.event.MachineProcessMessenger;
import org.eclipse.che.api.machine.server.event.MachineStateMessenger;
import org.eclipse.che.inject.DynaModule;

/**
 * Guice container configuration file. Replaces old REST application composers and servlet context listeners.
 *
 * @author Alexander Garagatyi
 */
@DynaModule
public class MachineModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(MachineStateMessenger.class).asEagerSingleton();
        bind(MachineProcessMessenger.class).asEagerSingleton();
    }
}
