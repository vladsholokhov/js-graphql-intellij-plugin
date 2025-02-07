/*
 * Copyright (c) 2018-present, Jim Kynde Meyer
 * All rights reserved.
 * <p>
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */
package com.intellij.lang.jsgraphql.psi;

import com.intellij.psi.PsiNameIdentifierOwner;
import org.jetbrains.annotations.Nullable;

public interface GraphQLNamedElement extends PsiNameIdentifierOwner, GraphQLElement {
    @Nullable
    @Override
    GraphQLIdentifier getNameIdentifier();
}
