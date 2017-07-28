# FoBo Font Awesome Resource Module

This FoBo resource module provides the Font Awesome resource components to the FoBo Font Awesome Toolkit Module, 
but can also be used as-is, see below for setup information.

## Components and available versions 

- Font Awesome [v3.2.1, v4.0.3, v4.1.0, v4.3.0, v4.6.3] - [Font Awesome](http://fortawesome.github.com/Font-Awesome/)

## Integration into your project 

### Dependency settings

Example setup:

**SBT:**
```scala
"net.liftmodules" %% "fobo-font-awesome-res_3.1 % "2.0"
```      
**Maven:**
```xml        
<dependency>
  <groupId>net.liftmodules</groupId>
  <artifactId>fobo-font-awesome-res_3.1_2.12.2</artifactId>
  <version>2.0</version>
</dependency>
```
The example will include a module built for lift 3.1.x. 
If you are using maven observe that the artifact id also needs the Scala version.

### Lift FoBo boot hooks (when used as stand alone module)
```scala
import net.liftmodules.{fobofares => fobo}
  :
fobo.Resource.init = fobo.Resource.FontAwesomeXYZ 
```
### Lift FoBo boot hooks (when used in the FoBo module)
```scala
import net.liftmodules.fobo
  :
fobo.Resource.init = fobo.Resource.FontAwesomeXYZ 
```
### Lift FoBo Template hooks
```html
<link rel="stylesheet" type='text/css' href='/classpath/fobo/font-awesome.css'> 
<link rel="stylesheet" type='text/css' href='[path/to/you/app/specific/css/file/in/the/webapp/dir]'>
```
For more information on how to use the font awesome fonts see [Font Awesome](http://fortawesome.github.com/Font-Awesome/)

## Contributions

Improvements, contributions and suggestions are welcome! Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). You can also leave a issue report or drop a question/suggestion on [Lift's mailing list](http://groups.google.com/group/liftweb/) 

