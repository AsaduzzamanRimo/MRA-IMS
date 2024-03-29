const { defineConfig } = require("cypress");

module.exports = defineConfig({
  reporter: 'cypress-mochawesome-reporter', //for html report
  e2e: {
    setupNodeEvents(on, config) {
      // implement node event listeners here
      this.screenshotOnRunFailure=true; //to capture screenshot for failed tests
      require('cypress-mochawesome-reporter/plugin')(on); //for html report
    },
  },
});
