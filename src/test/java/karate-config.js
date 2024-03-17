function fn() {

var env = karate.env; // get system property 'karate.env'
    karate.log('karate.env system property was:', env);
    if (!env) {
        env = 'dev';
    }}var config = {
              env: env,
              baseUrl: 'https://petstore.swagger.io'
          }
          if (env == 'dev') {
              // customize
              // e.g. config.foo = 'bar';
          } else if (env == 'e2e') {
              // customize
          }
  var config = {}
  var android = {}
  android["desiredConfig"] = {
   "app" : "src/test/resources/UiDemo.apk",
   "newCommandTimeout" : 300,
   "platformVersion" : "9.0",
   "platformName" : "Android",
   "connectHardwareKeyboard" : true,
   "deviceName" : "emulator-5554",
   "avd" : "Pixel2_PIE",
   "automationName" : "UiAutomator2"
  }
  config["android"] = android
  return config;
}