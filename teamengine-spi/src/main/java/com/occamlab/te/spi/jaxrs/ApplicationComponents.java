/*
 * The Open Geospatial Consortium licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 */
package com.occamlab.te.spi.jaxrs;

import com.sun.jersey.api.core.PackagesResourceConfig;

/**
 * Dynamically searches for root resource and provider classes. An instance of
 * this class defines the components of a JAX-RS application and is used to
 * configure a runtime environment such as a web container.
 *
 * @see com.sun.jersey.api.core.PackagesResourceConfig
 * @see javax.ws.rs.core.Application
 */
public class ApplicationComponents extends PackagesResourceConfig {

    /**
     * Default constructor scans for root resource classes in the
     * <code>com.occamlab.te.spi.jaxrs.resources</code> package (or a
     * sub-package).
     */
    public ApplicationComponents() {
        super("com.occamlab.te.spi.jaxrs.resources");
    }

}
