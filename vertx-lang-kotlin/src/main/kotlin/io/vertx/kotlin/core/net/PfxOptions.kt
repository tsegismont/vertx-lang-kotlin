/*
 * Copyright 2019 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.kotlin.core.net

import io.vertx.core.net.PfxOptions

/**
 * A function providing a DSL for building [io.vertx.core.net.PfxOptions] objects.
 *
 * Key or trust store options configuring private key and/or certificates based on PKCS#12 files.
 *
 * @param alias  Set the alias for a server certificate when the keystore has more than one.
 * @param password  Set the password for the key store
 * @param path  Set the path to the key store
 * @param value  Set the key store as a buffer
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.PfxOptions original] using Vert.x codegen.
 */
fun pfxOptionsOf(
  alias: String? = null,
  password: String? = null,
  path: String? = null,
  value: io.vertx.core.buffer.Buffer? = null): PfxOptions = io.vertx.core.net.PfxOptions().apply {

  if (alias != null) {
    this.setAlias(alias)
  }
  if (password != null) {
    this.setPassword(password)
  }
  if (path != null) {
    this.setPath(path)
  }
  if (value != null) {
    this.setValue(value)
  }
}

