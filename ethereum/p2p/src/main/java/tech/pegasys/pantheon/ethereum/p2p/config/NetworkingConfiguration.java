/*
 * Copyright 2018 ConsenSys AG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package tech.pegasys.pantheon.ethereum.p2p.config;

import java.util.Objects;

public class NetworkingConfiguration {
  private DiscoveryConfiguration discovery = new DiscoveryConfiguration();
  private RlpxConfiguration rlpx = new RlpxConfiguration();

  public static NetworkingConfiguration create() {
    return new NetworkingConfiguration();
  }

  public DiscoveryConfiguration getDiscovery() {
    return discovery;
  }

  public NetworkingConfiguration setDiscovery(final DiscoveryConfiguration discovery) {
    this.discovery = discovery;
    return this;
  }

  public RlpxConfiguration getRlpx() {
    return rlpx;
  }

  public NetworkingConfiguration setRlpx(final RlpxConfiguration rlpx) {
    this.rlpx = rlpx;
    return this;
  }

  @Override
  public boolean equals(final Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof NetworkingConfiguration)) {
      return false;
    }
    final NetworkingConfiguration that = (NetworkingConfiguration) o;
    return Objects.equals(discovery, that.discovery) && Objects.equals(rlpx, that.rlpx);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discovery, rlpx);
  }

  @Override
  public String toString() {
    return "NetworkingConfiguration{" + "discovery=" + discovery + ", rlpx=" + rlpx + '}';
  }
}
