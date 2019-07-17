import LiftModuleKeys.liftEdition

moduleName := "fobo-jquery-res"

moduleName := { name.value + "_" + liftEdition.value }

libraryDependencies ++= {
  "net.liftmodules" %% ("lift-jquery-module" + "_" + liftEdition.value) % "2.12-SNAPSHOT" % "compile" ::
    Nil
}
