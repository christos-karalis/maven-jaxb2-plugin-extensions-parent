Extensions for maven-jaxb2-plugin
=================================

Extensions for maven-jaxb2-plugin

* -Xprivate : sets all the accessors to private
* -XBoolean-getter : replaces all the getters from is... to get...
  for non primitive Boolean fields
* -Xdate-clone : replace the getters/setters for Date fields and return
  a clone of the original value to prevent its modification
* -Xbyte-array-copy : replace the getters/setters for byte[] fields and return
  a clone of the original value to prevent its modification