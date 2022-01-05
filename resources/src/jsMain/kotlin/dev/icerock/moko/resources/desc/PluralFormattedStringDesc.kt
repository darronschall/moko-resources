/*
 * Copyright 2022 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

package dev.icerock.moko.resources.desc

import dev.icerock.moko.resources.PluralsResource

actual class PluralFormattedStringDesc actual constructor(
    pluralsRes: PluralsResource,
    number: Int,
    args: List<Any>
) : StringDesc