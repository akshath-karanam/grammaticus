/*
 * Copyright (c) 2017, salesforce.com, inc.
 * All rights reserved.
 * Licensed under the BSD 3-Clause license.
 * For full license text, see LICENSE.txt file in the repo root  or https://opensource.org/licenses/BSD-3-Clause
 */

package com.force.i18n.grammar;

import java.io.Serializable;

/**
 * A base interface for all the grammatical forms.
 * @author stamm
 */
public interface GrammaticalForm extends Serializable {
    /**
     * @return the number associated with this adjective form
     */
    LanguageNumber getNumber();
    /**
     * @return the grammatical case associated with this adjective form
     */
    LanguageCase getCase();

    /**
     * @return a HTML compatible screen that can be used to represent this grammatical
     * form uniquely when compared to all other forms.
     */
    String getKey();
}
