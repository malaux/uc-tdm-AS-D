/*
Copyright 2016, 2017 Institut National de la Recherche Agronomique

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/


package alvisnlp.corpus.creators;

import alvisnlp.corpus.NameType;
import alvisnlp.module.lib.Param;
import alvisnlp.module.types.Mapping;

/**
 * An annotation creator sets constant features to new annotations.
 * 
 * @author rbossy
 */
public interface AnnotationCreator extends ElementCreator {

    /**
     * Returns the constant annotation features.
     * @return the constant annotation features
     */
    @Param(mandatory=false, nameType=NameType.FEATURE, defaultDoc = "Constant features to add to each annotation created by this module")
    public Mapping getConstantAnnotationFeatures();

    /**
     * Sets the constant annotation features.
     * @param constantAnnotationFeatures the new constant annotation features
     */
    public void setConstantAnnotationFeatures(Mapping constantAnnotationFeatures);
}
