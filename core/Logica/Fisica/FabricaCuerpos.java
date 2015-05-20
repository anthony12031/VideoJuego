package Fisica;

import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.BodyDef.BodyType;
import com.badlogic.gdx.physics.box2d.CircleShape;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.utils.Disposable;

public class FabricaCuerpos implements Disposable{

	
	private static FabricaCuerpos instancia = null;
	
	BodyDef cuerpo_dinamico;
	BodyDef cuerpo_estatico;
	
	
	// Squares
	FixtureDef boxFixtureDef;
	PolygonShape square;
			
	// Circles
	CircleShape circle;
	FixtureDef circleFixtureDef;
	
	private FabricaCuerpos(){
		
		// Default Body Definition
		cuerpo_dinamico = new BodyDef();
		cuerpo_dinamico.type = BodyType.DynamicBody;
		
		cuerpo_estatico = new BodyDef();
		cuerpo_estatico.type = BodyType.StaticBody;

		// Shape for square
		square = new PolygonShape();
		// 1 meter-sided square
		//square.setAsBox(32.5f,32.5f);
		
		// Shape for circles
		circle = new CircleShape();
		// 0.5 metres for radius
		circle.setRadius(40.5f);
					
		// Fixture definition for our shapes
		boxFixtureDef = new FixtureDef();
		boxFixtureDef.shape = square;
					
		// Fixture definition for our shapes
		circleFixtureDef = new FixtureDef();
		circleFixtureDef.shape = circle;
	
	}
	
		public Body crearCuerpoRectangular(BodyType tipo,float x, float y,float ancho,float alto,World world) {
			
			BodyDef cuerpo = cuerpo_estatico;
			if(tipo == BodyType.DynamicBody)
				cuerpo = cuerpo_dinamico;
			
			cuerpo.position.set((x+15),(y+15));
			square.setAsBox(ancho/2, alto/2);
			Body body = world.createBody(cuerpo);
			body.createFixture(boxFixtureDef);
			return body;
		}

		public Body crearCuerpoCircular(BodyType tipo,float x, float y,World world) {
			BodyDef cuerpo = cuerpo_estatico;
			if(tipo == BodyType.DynamicBody)
				cuerpo = cuerpo_dinamico;
			
			cuerpo.position.set((x+10),(y+10));
			Body body = world.createBody(cuerpo);
			body.createFixture(circleFixtureDef);
			return body;
		}

		public static FabricaCuerpos getInstancia() {
			if(instancia == null) instancia = new FabricaCuerpos();
			return instancia;
		}

		public static  void setInstancia(FabricaCuerpos instancia) {
			instancia = instancia;
		}

		@Override
		public void dispose() {
			
			circle.dispose();
			square.dispose();
			
		} 
	
	
}
