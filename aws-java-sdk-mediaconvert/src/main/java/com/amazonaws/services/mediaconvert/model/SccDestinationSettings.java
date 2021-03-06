/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Settings for SCC caption output.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/SccDestinationSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SccDestinationSettings implements Serializable, Cloneable, StructuredPojo {

    private String framerate;

    /**
     * @param framerate
     * @see SccDestinationFramerate
     */

    public void setFramerate(String framerate) {
        this.framerate = framerate;
    }

    /**
     * @return
     * @see SccDestinationFramerate
     */

    public String getFramerate() {
        return this.framerate;
    }

    /**
     * @param framerate
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SccDestinationFramerate
     */

    public SccDestinationSettings withFramerate(String framerate) {
        setFramerate(framerate);
        return this;
    }

    /**
     * @param framerate
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SccDestinationFramerate
     */

    public SccDestinationSettings withFramerate(SccDestinationFramerate framerate) {
        this.framerate = framerate.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFramerate() != null)
            sb.append("Framerate: ").append(getFramerate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SccDestinationSettings == false)
            return false;
        SccDestinationSettings other = (SccDestinationSettings) obj;
        if (other.getFramerate() == null ^ this.getFramerate() == null)
            return false;
        if (other.getFramerate() != null && other.getFramerate().equals(this.getFramerate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFramerate() == null) ? 0 : getFramerate().hashCode());
        return hashCode;
    }

    @Override
    public SccDestinationSettings clone() {
        try {
            return (SccDestinationSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.SccDestinationSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
