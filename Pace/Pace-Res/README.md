# FoBo Pace Resource Module

This FoBo resource module provides Pace resouces to the Pace toolkit module, 
but can also be used as-is, see below for setup information. 

## Components and available versions 

- FoBo-Pace [v0.4.15, v1.0.2] - [Pace](http://github.hubspot.com/pace/docs/welcome/) 

## Integration into your project 

### Dependency settings

Example setup:

**SBT:**
```scala
"net.liftmodules" %% "fobo-pace-res_3.3" % "2.1.0"
```
**Maven:**
```xml
<dependency>
  <groupId>net.liftmodules</groupId>
  <artifactId>fobo-pace-res_3.3_2.12.7</artifactId>
  <version>2.1.0</version>
</dependency>
```
The example will include a module built for lift 3.3.x. 
If you are using maven observe that the artifact id also needs the Scala version.

### Lift FoBo boot hooks (when used as stand alone module)
```scala
import net.liftmodules.{fobopares => fobo}
  :
fobo.Resource.init = fobo.Resource.PaceXYZ    
```
### Lift FoBo boot hooks (when used in the FoBo module)
```scala
import net.liftmodules.fobo 
  :
fobo.Resource.init = fobo.Resource.PaceXYZ 
```
### Lift FoBo Template hooks

OBS! v1.x adds a color prefix in the css path representing the theme color. Available colors is listed below

```html
<!--v0.4.15-->
<link rel="stylesheet" type="text/css" href="/classpath/fobo/pace-theme-minimal.css">
<!--v1.0.2-->
<link rel="stylesheet" type="text/css" href="/classpath/fobo/<colour prefix>/pace-theme-minimal.css">
<!--all versions-->
<script src="/classpath/fobo/pace.js" type="text/javascript"></script>
```
Css files

- pace-theme-flash-red.css [v0.4.15]
- pace-theme-minimal-red.css [v0.4.15]
- pace-theme-barber-shop.css [v0.4.15, v1.0.2]
- pace-theme-big-counter.css [v0.4.15, v1.0.2]
- pace-theme-bounce.css [v0.4.15, v1.0.2]
- pace-theme-center-circle.css [v0.4.15, v1.0.2]
- pace-theme-corner-indicator.css [v0.4.15, v1.0.2]
- pace-theme-fill-left.css [v0.4.15, v1.0.2]
- pace-theme-flash.css [v0.4.15, v1.0.2]
- pace-theme-flat-top.css [v0.4.15, v1.0.2]
- pace-theme-mac-osx.css [v0.4.15, v1.0.2]
- pace-theme-minimal.css [v0.4.15, v1.0.2]
- pace-theme-center-atom.css [v1.0.2]
- pace-theme-center-radar.css [v1.0.2]
- pace-theme-center-simple.css [v1.0.2]
- pace-theme-loading-bar.css [v1.0.2]

Colour prefixes (in v1.x) 
- [ black, blue, green, orange, pink, purple, red, silver, white, yellow ] 
 
Script files

- pace.js [v0.4.15, v1.0.2]

For more information on how to use Pace see [Pace](http://github.hubspot.com/pace/docs/welcome/)

## Contributions

Improvements, contributions and suggestions are welcome! 
Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). 
You can also leave a issue report or drop a question/suggestion on [Lift's mailing list](http://groups.google.com/group/liftweb/) 
