<script src="https://cdnjs.cloudflare.com/ajax/libs/viz.js/2.1.2/viz.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/viz.js/2.1.2/full.render.js"></script>

# TEST

<div id="un"></div>
<script>
	var viz = new Viz();
	viz.renderSVGElement('digraph G { a->b;b->c;c->a;}').then(elem => document.getElementById("un").appendChild(elem)).catch(error=> console.log(error));
</script>

