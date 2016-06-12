var World = {
    loaded: false,

    init: function initFn() {
        this.createOverlays();
    },

    createOverlays: function createOverlaysFn() {



        // inicializamos el Tracker con el Target collection (nuestra caratula del libro Deitel)
        this.tracker = new AR.Tracker("assets/targetcollection.wtc", {
            onLoaded: this.worldLoaded
        });

        		// creamos un overlay imagen uno

        		//var javaDeitel = new AR.ImageResource("assets/javaDeitel.jpg");
        		var javaDeitel = new AR.ImageResource("http://usofeed.netai.net/rauno.jpg");

        		var overlay = new AR.ImageDrawable(javaDeitel, 2, {

        			offsetX: 0,

        			offsetY: 0
        		});



	// indicamos el nombre del Target en el Tracker, basicamente al momento de que el Target sea rastreado por el Tracker el objeto htmlDrawable sera renderizado en la pantalla del dispositivo
        var javaLibro = new AR.Trackable2DObject(this.tracker, "javaLibro", {
            drawables: {
                cam: overlay
            }
        });

        //////////////////////////////////////////////////



                		// creamos un overlay imagen uno


                		var javaDeitela = new AR.ImageResource("http://usofeed.netai.net/rados.jpg");

                		var overlay = new AR.ImageDrawable(javaDeitela, 2, {

                			offsetX: 0,

                			offsetY: 0
                		});



        	// indicamos el nombre del Target en el Tracker, basicamente al momento de que el Target sea rastreado por el Tracker el objeto htmlDrawable sera renderizado en la pantalla del dispositivo
                var javaLibroa = new AR.Trackable2DObject(this.tracker, "javaLibroa", {
                    drawables: {
                        cam: overlay
                    }
                });

///////////////////////////////////////////////////////////////
                        		// creamos un overlay imagen uno


                        		var javaDeitelb = new AR.ImageResource("http://usofeed.netai.net/ratres.jpg");

                        		var overlay = new AR.ImageDrawable(javaDeitelb, 2, {

                        			offsetX: 0,

                        			offsetY: 0
                        		});



                	// indicamos el nombre del Target en el Tracker, basicamente al momento de que el Target sea rastreado por el Tracker el objeto htmlDrawable sera renderizado en la pantalla del dispositivo
                        var javaLibrob = new AR.Trackable2DObject(this.tracker, "javaLibrob", {
                            drawables: {
                                cam: overlay
                            }
                        });

        /////////////////////////////////////////////////


    }
};

// principal
World.init();
