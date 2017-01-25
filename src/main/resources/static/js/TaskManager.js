/**
 * Created by leon on 24/01/2017.
 */

$(document).ready(function (){
    var path = window.location.pathname;

    removeActiveTabs();

    switch(path){
        case "/tasks":
            break;
        case "/employees":
            var tab = $(document).find("#employees-tab");
            tab.attr("class", "active");
            break;
        case "/teams":
            var tab = $(document).find("#teams-tab");
            tab.attr("class", "active");
            break;
        case "/":
            break;
    }
});


function removeActiveTabs() {
    var activeTab = $(document).find(".active");
    activeTab.removeClass("active");
}