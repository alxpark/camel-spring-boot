/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.ganglia.springboot;

import javax.annotation.Generated;
import info.ganglia.gmetric4j.gmetric.GMetric.UDPAddressingMode;
import info.ganglia.gmetric4j.gmetric.GMetricSlope;
import info.ganglia.gmetric4j.gmetric.GMetricType;
import org.apache.camel.component.ganglia.GangliaComponent;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.DeprecatedConfigurationProperty;

/**
 * Send metrics to Ganglia monitoring system.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.ganglia")
public class GangliaComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the ganglia component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * Minumum time in seconds before Ganglia will purge the metric value if it
     * expires. Set to 0 and the value will remain in Ganglia indefinitely until
     * a gmond agent restart.
     */
    private Integer dmax = 0;
    /**
     * The group that the metric belongs to.
     */
    private String groupName = "java";
    /**
     * Whether the producer should be started lazy (on the first message). By
     * starting lazy you can use this to allow CamelContext and routes to
     * startup in situations where a producer may otherwise fail during starting
     * and cause the route to fail being started. By deferring this startup to
     * be lazy then the startup failure can be handled during routing messages
     * via Camel's routing error handlers. Beware that when the first message is
     * processed then creating and starting the producer may take a little time
     * and prolong the total processing time of the processing.
     */
    private Boolean lazyStartProducer = false;
    /**
     * The name to use for the metric.
     */
    private String metricName = "metric";
    /**
     * Send the UDP metric packets using MULTICAST or UNICAST
     */
    private UDPAddressingMode mode = UDPAddressingMode.MULTICAST;
    /**
     * Prefix the metric name with this string and an underscore.
     */
    private String prefix;
    /**
     * The slope
     */
    private GMetricSlope slope = GMetricSlope.BOTH;
    /**
     * Spoofing information IP:hostname
     */
    private String spoofHostname;
    /**
     * Maximum time in seconds that the value can be considered current. After
     * this, Ganglia considers the value to have expired.
     */
    private Integer tmax = 60;
    /**
     * If using multicast, set the TTL of the packets
     */
    private Integer ttl = 5;
    /**
     * The type of value
     */
    private GMetricType type = GMetricType.STRING;
    /**
     * Any unit of measurement that qualifies the metric, e.g. widgets, litres,
     * bytes. Do not include a prefix such as k (kilo) or m (milli), other tools
     * may scale the units later. The value should be unscaled.
     */
    private String units;
    /**
     * Use the wire format of Ganglia 3.1.0 and later versions. Set this to
     * false to use Ganglia 3.0.x or earlier.
     */
    private Boolean wireFormat31x = true;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    @Deprecated
    private Boolean basicPropertyBinding = false;
    /**
     * To use the shared configuration. The option is a
     * org.apache.camel.component.ganglia.GangliaConfiguration type.
     */
    private String configuration;

    public Integer getDmax() {
        return dmax;
    }

    public void setDmax(Integer dmax) {
        this.dmax = dmax;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public UDPAddressingMode getMode() {
        return mode;
    }

    public void setMode(UDPAddressingMode mode) {
        this.mode = mode;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public GMetricSlope getSlope() {
        return slope;
    }

    public void setSlope(GMetricSlope slope) {
        this.slope = slope;
    }

    public String getSpoofHostname() {
        return spoofHostname;
    }

    public void setSpoofHostname(String spoofHostname) {
        this.spoofHostname = spoofHostname;
    }

    public Integer getTmax() {
        return tmax;
    }

    public void setTmax(Integer tmax) {
        this.tmax = tmax;
    }

    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public GMetricType getType() {
        return type;
    }

    public void setType(GMetricType type) {
        this.type = type;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public Boolean getWireFormat31x() {
        return wireFormat31x;
    }

    public void setWireFormat31x(Boolean wireFormat31x) {
        this.wireFormat31x = wireFormat31x;
    }

    @Deprecated
    @DeprecatedConfigurationProperty
    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    @Deprecated
    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }
}