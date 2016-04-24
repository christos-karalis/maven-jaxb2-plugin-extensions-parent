Extensions for maven-jaxb2-plugin [![Build Status](https://travis-ci.org/christos-karalis/maven-jaxb2-plugin-extensions-parent.svg?branch=master)](https://travis-ci.org/christos-karalis/maven-jaxb2-plugin-extensions-parent)
=================================

Extensions for maven-jaxb2-plugin

* -Xprivate : sets all the accessors to private
* -XBoolean-getter : replaces all the getters from is... to get...
  for non primitive Boolean fields
* -Xdate-clone : replace the getters/setters for Date fields and return
  a clone of the original value to prevent its modification
* -Xbyte-array-copy : replace the getters/setters for byte[] fields and return
  a clone of the original value to prevent its modification