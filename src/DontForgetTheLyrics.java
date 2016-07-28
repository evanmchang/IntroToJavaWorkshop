import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class DontForgetTheLyrics {
	/*
	 * For this game, we'll play the start of a song, and the player has to
	 * guess the rest of the lyrics.
	 * 
	 * 1. To record a sound clip, open Audacity and record your song.
	 * 
	 * 2. Click File -> Export Audio, and save your file on the Desktop.
	 * 
	 * 3. Drag your file from the Desktop into the "default package" under
	 * "src".
	 */

	public static void main(String[] args) {
		// 4. Make a pop-up to explain the game.
		JOptionPane.showMessageDialog(null,"After hearing part of the song, you must then remember the rest of the lyrics");
		String lyrics = "you know who I am "
I'm too hot (hot damn)
Am I bad 'bout that money
Break it down

Girls hit your hallelujah (whoo)
Girls hit your hallelujah (whoo)
Girls hit your hallelujah (whoo)
'Cause uptown funk gon' give it to you
'Cause uptown funk gon' give it to you
'Cause uptown funk gon' give it to you
Saturday night and we in the spot
Don't believe me just watch (come on)

Don't believe me just watch uh

Don't believe me just watch uh
Don't believe me just watch uh
Don't believe me just watch
Don't believe me just watch
Hey, hey, hey, oh

Before we leave
Lemmi tell y'all a lil' something
Uptown funk you up
Uptown funk you up
Uptown funk you up
Uptown funk you up uh
I said uptown funk you up
Uptown funk you up
Uptown funk you up
Uptown funk you up

Come on, dance, jump on it
If you sexy then flaunt it
If you freaky then own it
Don't brag about it, come show me

Come on, dance
Jump on it
If you sexy then flaunt it
Well it's Saturday night and we in the spot
Don't believe me just watch come on!

Don't believe me just watch uh

Don't believe me just watch uh
Don't believe me just watch uh
Don't believe me just watch
Don't believe me just watch
Hey, hey, hey, oh

Uptown funk you up
Uptown funk you up (say what?)
Uptown funk you up
Uptown funk you up
Uptown funk you up
Uptown funk you up (say what?)
Uptown funk you up
Uptown funk you up
Uptown funk you up
Uptown funk you up (say what?)
Uptown funk you up
Uptown funk you up
Uptown funk you up
Uptown funk you up (say what?)
Uptown funk you up";
		// 5. Use the playSound method to play your song.
		playSound("Uptown Funk 2.wav");
		// 6. Make a pop-up for the player to type their answer.
		JOptionPane.showInputDialog("Type in the rest of the lyrics");
		// 7. If they answered correctly, tell them that they were right.
		if(){}
		// 8. Otherwise, tell them they are wrong, and give them the answer.

		// 9. Record another sound and repeat steps 5-8.

		// 10. [optional] Add a points variable that will calculate their final
		// score.
	}

	public static void playSound(String fileName) {
		AudioClip audioClip = JApplet.newAudioClip(new DontForgetTheLyrics().getClass().getResource(fileName));
		audioClip.play();
	}
}
