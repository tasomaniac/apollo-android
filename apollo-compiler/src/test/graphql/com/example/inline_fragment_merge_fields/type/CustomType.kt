// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.inline_fragment_merge_fields.type

import com.apollographql.apollo.api.ScalarType
import java.lang.Class
import kotlin.String

enum class CustomType : ScalarType {
  ID {
    override fun typeName(): String = "ID"

    override fun javaType(): Class<*> = kotlin.String::class.java
  },

  URL {
    override fun typeName(): String = "URL"

    override fun javaType(): Class<*> = kotlin.Any::class.java
  }
}
