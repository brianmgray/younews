$("#enterform").click(function(){

alert("button was pressed");



$.fn.teletype = function(opts){
    var $this = this,
        defaults = {
            animDelay: 50
        },
        settings = $.extend(defaults, opts);

    $.each(settings.text.split(''), function(i, letter){
        setTimeout(function(){
            $this.html($this.html() + letter);
        }, settings.animDelay * i);
    });
};


$(function(){
    $('#storytext').teletype({
        animDelay: 10,
        text: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus ornare magna metus, ac pulvinar nibh. Ut bibendum, risus gravida euismod pellentesque, nulla nisl accumsan enim, sed tristique mauris mauris at eros. Fusce at eros eu metus faucibus tempus non vitae mi. Praesent sagittis semper quam, id tincidunt diam feugiat non. Aliquam in erat est, nec luctus dui. Quisque ut libero sed quam pretium pellentesque. Donec iaculis, elit at porta molestie, erat nulla venenatis justo, vitae convallis dolor sem vel risus. Nullam urna massa, accumsan non pharetra vitae, consequat sit amet nisl. Fusce nec justo commodo ligula sagittis consequat eu nec nulla. Duis imperdiet sapien dictum justo tempus tristique. Nam tristique commodo placerat. Suspendisse suscipit erat nec nisl ultrices luctus. Ut faucibus nibh nec turpis fermentum scelerisque. Nam interdum mattis diam quis aliquam. Nulla vel arcu arcu, vel varius erat.  Pellentesque gravida tellus vel elit feugiat malesuada egestas purus semper. Integer mattis metus eu eros pharetra sollicitudin. Suspendisse sit amet imperdiet sapien. Suspendisse interdum enim porttitor <br>quam cursus laoreet. Vestibulum sed posuere ipsum. Maecenas non ante elit, nec semper velit. Phasellus tempor sollicitudin nisi ut condimentum. In id ligula risus, eget viverra mi. Vestibulum metus erat, pharetra quis egestas vel, cursus vel dolor. Proin in eros sit amet leo pharetra condimentum. Etiam id purus libero. Aenean at tortor porta nisl eleifend mollis eget sed risus. Sed auctor consequat lacus, vel pellentesque justo mattis ut.'
    });
});

});