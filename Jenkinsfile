node {
   groovy.lang.Binding myBinding = getBinding()
   boolean mybool = myBinding.hasVariable("STRING_PARAM1")
   echo mybool.toString()
  
   echo STRING_PARAM1
   echo getProperty("STRING_PARAM1")
   

   mybool = myBinding.hasVariable("DID_NOT_DEFINE_THIS")
  
   echo DID_NOT_DEFINE_THIS
   echo getProperty("DID_NOT_DEFINE_THIS")
   
}