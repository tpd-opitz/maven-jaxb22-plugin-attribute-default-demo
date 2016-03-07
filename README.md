# Plugin fail for attribute default values

In my projects I generate Java classes from XSD files.

so far I used org.codehouse.mojo:jaxb2-mave-plugin:1.5

Since I need to introduce Java8 property bindings I changed to org.jvnet.jaxb2.maven2:maven-jaxb2-plugin:0.13.1.

I ran into the problem that this plugin does not respect the default attribute in  <xs:attribute default=""> .

The sample project her demonstrates the wrong behavior. The expectation is that the JUnitTest provided should pass but it doesn't.

TPD
