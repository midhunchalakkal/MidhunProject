node {
   groovy.lang.Binding myBinding = getBinding()
   boolean mybool = myBinding.hasVariable("STRING_PARAM1")
   echo mybool.toString()
   if (mybool) {
       echo STRING_PARAM1
       echo getProperty("STRING_PARAM1")
   } else {
       echo "STRING_PARAM1 is not defined"
   }

   mybool = myBinding.hasVariable("DID_NOT_DEFINE_THIS")
   if (mybool) {
       echo DID_NOT_DEFINE_THIS
       echo getProperty("DID_NOT_DEFINE_THIS")
   } else {
       echo "DID_NOT_DEFINE_THIS is not defined"
   }
}