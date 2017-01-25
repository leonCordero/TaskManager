/**
 * Created by leon on 24/01/2017.
 */

$(document).ready(function () {
    var path = window.location.pathname;

    removeActiveTabs();

    switch (path) {
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

$(document).ready(function () {
    $("#save-employee-submit").on("click", function () {
        var form = $(document).find(".save-employee-form");
        var team = "";
        $('.team-input').each(function () {
            if (this.checked) {
                team = team.concat(this.value);
                team = team.concat(",")
            }
        });
        team = team.substr(0, team.length - 1);
        $(document).find(".teams-selected").val(team);
        form.submit();
    });
});


function removeActiveTabs() {
    var activeTab = $(document).find(".active");
    activeTab.removeClass("active");
}