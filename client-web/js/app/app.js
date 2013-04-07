!function($) {

  var baseUrl = "http://localhost/server/api";

  $(function() {

    // handle click event for create button
    $('#btnCreate').click(function() {
      jQuery.ajax({
        type: 'post',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
        'url': baseUrl + "/story",
        'data': JSON.stringify(mockData()),
        'dataType': 'json'
      })
      .done(function(data) { $("#output").html(data) })
      .fail(function(e) { alert("error"); });
    });

    // handle click event for feed button
    $('#btnFeed').click(function() {
      $.get(baseUrl + "/feed/15217")
        .done(function(data) {
          $("#output").empty();
          $.each(data.stories, function(i, story) {
            $("#output").append(story.headline + "<br/>");
          });
        })
        .fail(function() { alert("error"); })
    });

    function mockData() {
      return {
        "headline": "A Walk on the West Side",
        "location": 12517,
        "authorId": 1258,
        "story": "This is my story. It can be long. It can also contain &lt;strong&gt;html&lt;/strong&gt;",
        "links": [
          "http://feeds.themoth.org/~r/themothpodcast/~5/rzQ00FhC99E/moth-podcast-270-wayne-reece.mp3"
        ],
        "privacy": "PUBLIC"
      };
    }

  });

}(window.jQuery);