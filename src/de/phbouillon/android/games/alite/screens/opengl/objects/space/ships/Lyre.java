package de.phbouillon.android.games.alite.screens.opengl.objects.space.ships;

/* Alite - Discover the Universe on your Favorite Android Device
 * Copyright (C) 2015 Philipp Bouillon
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 3 of the License, or
 * any later version.
 *
 * This program is distributed in the hope that it will be useful and
 * fun, but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see
 * http://http://www.gnu.org/licenses/gpl-3.0.txt.
 */

/**
 * Tiger model and texture from Oolite.
 * Renamed to Lyre for Alite. 
 */

import de.phbouillon.android.framework.impl.gl.GlUtils;
import de.phbouillon.android.framework.math.Vector3f;
import de.phbouillon.android.games.alite.Alite;
import de.phbouillon.android.games.alite.Settings;
import de.phbouillon.android.games.alite.model.statistics.ShipType;
import de.phbouillon.android.games.alite.screens.opengl.ingame.EngineExhaust;
import de.phbouillon.android.games.alite.screens.opengl.ingame.ObjectType;
import de.phbouillon.android.games.alite.screens.opengl.objects.space.SpaceObject;

public class Lyre extends SpaceObject {
    public static final Vector3f HUD_COLOR = new Vector3f(0.55f, 0.67f, 0.94f);

    private static final float [] VERTEX_DATA = new float [] {
         49.38f,  -0.00f, 133.42f,  78.10f,   6.87f,  85.17f, 
         70.91f,  -0.00f,  81.82f, -49.38f,   0.00f, 133.42f, 
        -70.91f,   0.00f,  81.82f, -78.10f,   6.87f,  85.17f, 
         78.10f,  -6.87f,  85.17f, -78.10f,  -6.87f,  85.17f, 
         92.49f,  -6.87f,  91.88f, -92.49f,  -6.87f,  91.88f, 
         99.68f,  -0.00f,  95.23f, -99.68f,   0.00f,  95.23f, 
         92.49f,   6.87f,  91.88f, -92.49f,   6.87f,  91.88f, 
        -121.37f,  13.75f,  43.63f, -89.63f,  13.75f,  43.63f, 
        -119.38f,  20.62f, -35.61f, -78.15f,  20.62f, -11.80f, 
        -137.24f,   0.00f,  43.63f, -140.00f,   0.00f, -47.51f, 
        -121.37f, -13.75f,  43.63f, -119.38f, -20.62f, -35.61f, 
        -89.63f, -13.75f,  43.63f, -78.15f, -20.62f, -11.80f, 
        -73.75f,   0.00f,  43.63f, -57.53f,   0.00f,   0.10f, 
        -88.35f,  26.12f, -91.02f, -58.20f,  26.12f, -38.79f, 
         -0.08f,  28.71f, -133.42f,   0.00f,  27.49f, -54.81f, 
        -103.43f,   0.00f, -117.14f, -88.35f, -26.12f, -91.02f, 
        -58.20f, -26.12f, -38.79f,   0.00f, -27.49f, -54.81f, 
         -0.08f, -28.71f, -133.42f, -43.12f,   0.00f, -12.68f, 
        121.37f,  13.75f,  43.63f, 119.38f,  20.62f, -35.61f, 
         78.15f,  20.62f, -11.80f,  89.63f,  13.75f,  43.63f, 
        137.24f,  -0.00f,  43.63f, 140.00f,  -0.00f, -47.51f, 
        121.37f, -13.75f,  43.63f, 119.38f, -20.62f, -35.61f, 
         89.63f, -13.75f,  43.63f,  78.15f, -20.62f, -11.80f, 
         73.75f,  -0.00f,  43.63f,  57.53f,  -0.00f,   0.10f, 
         89.15f,  26.12f, -90.23f,  58.99f,  26.12f, -37.99f, 
        104.23f,  -0.00f, -116.34f,  89.15f, -26.12f, -90.23f, 
         58.99f, -26.12f, -37.99f,  43.92f,  -0.00f, -11.88f, 
        -43.65f,  26.46f, -42.80f, -29.10f,  26.80f, -46.80f, 
        -14.55f,  27.15f, -50.81f, -14.55f, -27.15f, -50.81f, 
        -29.10f, -26.80f, -46.80f, -43.65f, -26.46f, -42.80f, 
        -54.43f, -19.59f, -32.26f, -50.66f, -13.06f, -25.73f, 
        -46.89f,  -6.53f, -19.20f, -28.79f,   0.00f,  33.62f, 
        -28.79f,  -7.83f,  33.62f,  -0.08f,   0.00f,  33.62f, 
        -26.18f, -13.05f,   7.52f, -36.11f,  -6.53f, -21.80f, 
        -39.88f, -13.06f, -28.33f, -43.65f, -19.59f, -34.86f, 
        -32.34f,   0.00f, -15.27f, -15.74f, -13.05f,  17.96f, 
         -0.08f, -13.05f,  80.60f, -29.10f, -19.93f, -38.87f, 
        -14.55f, -20.27f, -42.87f,   0.00f, -20.62f, -46.88f, 
        -46.89f,   6.53f, -19.20f, -50.66f,  13.06f, -25.73f, 
        -54.43f,  19.59f, -32.26f, -14.55f,  20.27f, -42.87f, 
         -0.08f,  13.05f,  12.74f,   0.00f,  20.62f, -46.88f, 
        -29.10f,  19.93f, -38.87f, -10.52f,  13.05f,  12.74f, 
        -20.96f,  13.05f,  12.74f, -43.65f,  19.59f, -34.86f, 
        -39.88f,  13.06f, -28.33f, -36.11f,   6.53f, -21.80f, 
        -20.96f,   2.61f,  20.57f,  14.75f,  27.15f, -50.61f, 
         29.50f,  26.80f, -46.40f,  44.25f,  26.46f, -42.20f, 
         44.25f, -26.46f, -42.20f,  29.50f, -26.80f, -46.40f, 
         14.75f, -27.15f, -50.61f,  36.71f,  -6.53f, -21.20f, 
         51.46f, -13.06f, -24.93f,  47.69f,  -6.53f, -18.40f, 
         32.94f,   0.00f, -14.67f,  28.63f,  -0.00f,  33.62f, 
         28.63f,  -7.83f,  33.62f,  40.48f, -13.06f, -27.73f, 
         26.02f, -13.05f,   7.52f,  44.25f, -19.59f, -34.26f, 
         55.22f, -19.59f, -31.46f,  15.58f, -13.05f,  17.96f, 
         14.75f, -20.27f, -42.67f,  29.50f, -19.93f, -38.47f, 
         29.50f,  19.93f, -38.47f,  20.80f,  13.05f,  12.74f, 
         44.25f,  19.59f, -34.26f,  14.75f,  20.27f, -42.67f, 
         10.36f,  13.05f,  12.74f,  40.48f,  13.06f, -27.73f, 
         51.46f,  13.06f, -24.93f,  55.22f,  19.59f, -31.46f, 
         20.80f,   2.61f,  20.57f,  36.71f,   6.53f, -21.20f, 
         47.69f,   6.53f, -18.40f,  -0.08f,  13.05f, -133.42f, 
         -0.08f,   0.00f, -133.42f, -52.28f,   0.00f, -133.42f, 
        -52.28f,  13.05f, -133.42f, -52.28f, -13.05f, -133.42f, 
         -0.08f, -13.05f, -133.42f,  52.12f,  13.05f, -133.42f, 
         52.12f,  -0.00f, -133.42f,  52.12f, -13.05f, -133.42f
    };

    private static final float [] NORMAL_DATA = new float [] {
         -0.60447f,   0.75566f,  -0.25220f,   0.60447f,   0.75566f,  -0.25220f, 
         -0.60447f,  -0.75566f,  -0.25220f,   0.60447f,  -0.75566f,  -0.25220f, 
         -0.05160f,  -0.99252f,   0.11066f,   0.05160f,  -0.99252f,   0.11066f, 
          0.42299f,  -0.71458f,   0.55719f,  -0.42299f,  -0.71458f,   0.55719f, 
          0.42299f,   0.71458f,   0.55719f,  -0.42299f,   0.71458f,   0.55719f, 
         -0.05160f,   0.99252f,   0.11066f,   0.05160f,   0.99252f,   0.11066f, 
          0.00000f,   0.99001f,   0.14103f,   0.06744f,   0.98719f,   0.14463f, 
         -0.04912f,   0.99516f,   0.08508f,   0.00000f,   0.99240f,   0.12304f, 
         -0.59098f,   0.68241f,   0.43019f,  -0.51880f,   0.74636f,   0.41688f, 
         -0.71315f,   0.70068f,   0.02158f,  -0.65387f,   0.75502f,   0.04908f, 
         -0.51880f,  -0.74637f,   0.41688f,  -0.59098f,  -0.68241f,   0.43018f, 
         -0.65386f,  -0.75502f,   0.04908f,  -0.71315f,  -0.70068f,   0.02158f, 
          0.06744f,  -0.98719f,   0.14463f,   0.00000f,  -0.99001f,   0.14103f, 
          0.00000f,  -0.99240f,   0.12304f,  -0.04912f,  -0.99516f,   0.08508f, 
          0.67758f,  -0.73371f,  -0.05044f,   0.65361f,  -0.75472f,  -0.05643f, 
          0.63599f,  -0.73438f,   0.23707f,   0.62241f,  -0.75056f,   0.22195f, 
          0.65361f,   0.75472f,  -0.05643f,   0.67758f,   0.73371f,  -0.05044f, 
          0.62241f,   0.75056f,   0.22195f,   0.63599f,   0.73438f,   0.23707f, 
         -0.08680f,   0.99496f,   0.05011f,  -0.08134f,   0.98668f,   0.14088f, 
         -0.02192f,   0.99964f,   0.01553f,  -0.63353f,   0.69851f,  -0.33274f, 
         -0.60232f,   0.75386f,  -0.26248f,  -0.60232f,  -0.75387f,  -0.26248f, 
         -0.63353f,  -0.69851f,  -0.33274f,  -0.08134f,  -0.98668f,   0.14088f, 
         -0.08680f,  -0.99496f,   0.05011f,  -0.02192f,  -0.99964f,   0.01553f, 
          0.44730f,  -0.73855f,   0.50446f,   0.44730f,   0.73855f,   0.50446f, 
          0.04912f,   0.99516f,   0.08508f,   0.00000f,   0.99240f,   0.12304f, 
         -0.06744f,   0.98719f,   0.14463f,   0.00000f,   0.99001f,   0.14103f, 
          0.71315f,   0.70068f,   0.02158f,   0.65386f,   0.75502f,   0.04908f, 
          0.59098f,   0.68241f,   0.43018f,   0.51880f,   0.74636f,   0.41688f, 
          0.65386f,  -0.75502f,   0.04908f,   0.71315f,  -0.70068f,   0.02158f, 
          0.51880f,  -0.74636f,   0.41688f,   0.59098f,  -0.68241f,   0.43018f, 
         -0.00000f,  -0.99240f,   0.12304f,   0.04912f,  -0.99516f,   0.08508f, 
         -0.06744f,  -0.98719f,   0.14463f,  -0.00000f,  -0.99001f,   0.14103f, 
         -0.63599f,  -0.73438f,   0.23707f,  -0.62242f,  -0.75056f,   0.22195f, 
         -0.67758f,  -0.73371f,  -0.05044f,  -0.65361f,  -0.75472f,  -0.05643f, 
         -0.62241f,   0.75056f,   0.22195f,  -0.63599f,   0.73438f,   0.23707f, 
         -0.65361f,   0.75472f,  -0.05643f,  -0.67758f,   0.73371f,  -0.05044f, 
          0.02156f,   0.99965f,   0.01549f,   0.08855f,   0.99476f,   0.05113f, 
          0.08401f,   0.98578f,   0.14551f,   0.63582f,   0.69753f,  -0.33044f, 
          0.60430f,   0.75362f,  -0.25862f,   0.60430f,  -0.75362f,  -0.25862f, 
          0.63582f,  -0.69753f,  -0.33044f,   0.02156f,  -0.99965f,   0.01549f, 
          0.08401f,  -0.98578f,   0.14551f,   0.08855f,  -0.99476f,   0.05113f, 
         -0.44571f,  -0.73812f,   0.50647f,  -0.44571f,   0.73812f,   0.50647f, 
         -0.02037f,   0.99972f,   0.01176f,  -0.02037f,   0.99972f,   0.01176f, 
         -0.02037f,   0.99972f,   0.01176f,  -0.02037f,   0.99972f,   0.01176f, 
         -0.02038f,  -0.99972f,   0.01176f,  -0.02038f,  -0.99972f,   0.01176f, 
         -0.02038f,  -0.99972f,   0.01176f,  -0.02038f,  -0.99972f,   0.01176f, 
          0.45216f,  -0.74757f,   0.48651f,   0.45216f,  -0.74757f,   0.48651f, 
          0.45216f,  -0.74757f,   0.48651f,   0.45216f,  -0.74757f,   0.48651f, 
          0.00000f,   0.00000f,   1.00000f,   0.25701f,  -0.94238f,   0.21418f, 
         -0.99139f,   0.00000f,   0.13091f,  -0.90926f,   0.39561f,   0.12936f, 
         -0.37880f,  -0.91406f,   0.14493f,   0.15703f,  -0.74219f,   0.65153f, 
          0.15703f,  -0.74219f,   0.65153f,   0.15703f,  -0.74219f,   0.65153f, 
          0.15703f,  -0.74219f,   0.65153f,  -0.91898f,   0.17951f,   0.35107f, 
          0.15703f,  -0.74219f,   0.65153f,   0.15703f,  -0.74219f,   0.65153f, 
          0.15703f,  -0.74219f,   0.65153f,  -0.89085f,   0.44967f,   0.06467f, 
         -0.70711f,   0.00000f,   0.70711f,  -0.73078f,   0.65771f,   0.18270f, 
         -0.15447f,  -0.97585f,   0.15447f,   0.00906f,  -0.99296f,   0.11810f, 
         -0.40115f,  -0.91051f,   0.10029f,   0.16026f,  -0.74616f,   0.64619f, 
          0.16026f,  -0.74616f,   0.64619f,   0.16026f,  -0.74616f,   0.64619f, 
          0.16026f,  -0.74616f,   0.64619f,  -0.00727f,  -0.99822f,   0.05926f, 
          0.16026f,  -0.74616f,   0.64619f,   0.16026f,  -0.74616f,   0.64619f, 
          0.16026f,  -0.74616f,   0.64619f,   0.01674f,  -0.98919f,   0.14567f, 
          0.45216f,   0.74757f,   0.48651f,   0.45216f,   0.74757f,   0.48651f, 
          0.45216f,   0.74757f,   0.48651f,   0.45216f,   0.74757f,   0.48651f, 
          0.01124f,   0.99197f,   0.12594f,   0.16026f,   0.74616f,   0.64619f, 
          0.16026f,   0.74616f,   0.64619f,   0.16026f,   0.74616f,   0.64619f, 
          0.16026f,   0.74616f,   0.64619f,   0.01180f,   0.99171f,   0.12797f, 
          0.00000f,   0.99167f,   0.12882f,   0.00000f,   0.99123f,   0.13216f, 
          0.00000f,   0.84800f,   0.53000f,   0.00000f,   0.84800f,   0.53000f, 
          0.01243f,   0.99141f,   0.13022f,   0.16026f,   0.74616f,   0.64619f, 
          0.16026f,   0.74616f,   0.64619f,   0.16026f,   0.74616f,   0.64619f, 
         -0.90323f,  -0.10548f,   0.41600f,   0.15703f,   0.74219f,   0.65153f, 
          0.15703f,   0.74219f,   0.65153f,   0.15703f,   0.74219f,   0.65153f, 
          0.15703f,   0.74219f,   0.65153f,  -0.92412f,  -0.22387f,   0.30966f, 
         -0.86660f,   0.29941f,   0.39921f,  -0.11063f,   0.98523f,   0.13067f, 
         -0.39114f,   0.55220f,   0.73626f,   0.00000f,   0.98058f,   0.19612f, 
         -0.89085f,  -0.44967f,   0.06467f,   0.15703f,   0.74219f,   0.65153f, 
          0.15703f,   0.74219f,   0.65153f,   0.15703f,   0.74219f,   0.65153f, 
          0.02000f,   0.99973f,   0.01155f,   0.02000f,   0.99973f,   0.01155f, 
          0.02000f,   0.99973f,   0.01155f,   0.02000f,   0.99973f,   0.01155f, 
          0.02000f,  -0.99973f,   0.01155f,   0.02000f,  -0.99973f,   0.01155f, 
          0.02000f,  -0.99973f,   0.01155f,   0.02000f,  -0.99973f,   0.01155f, 
         -0.16516f,  -0.74344f,   0.64809f,  -0.16516f,  -0.74344f,   0.64809f, 
          0.89575f,   0.43733f,   0.07983f,  -0.16516f,  -0.74344f,   0.64809f, 
          0.98933f,   0.00000f,   0.14570f,   0.91241f,   0.38331f,   0.14346f, 
         -0.16516f,  -0.74344f,   0.64809f,   0.36072f,  -0.92084f,   0.14810f, 
         -0.16516f,  -0.74344f,   0.64809f,  -0.16516f,  -0.74344f,   0.64809f, 
          0.91437f,   0.15308f,   0.37483f,  -0.16516f,  -0.74344f,   0.64809f, 
         -0.25701f,  -0.94238f,   0.21418f,   0.00000f,  -0.00000f,   1.00000f, 
          0.73078f,   0.65771f,   0.18270f,   0.70711f,  -0.00000f,   0.70711f, 
          0.40952f,  -0.90654f,   0.10238f,  -0.01063f,  -0.99290f,   0.11845f, 
          0.15777f,  -0.97479f,   0.15777f,  -0.16666f,  -0.74536f,   0.64550f, 
         -0.16666f,  -0.74536f,   0.64550f,  -0.16666f,  -0.74536f,   0.64550f, 
         -0.16666f,  -0.74536f,   0.64550f,  -0.01874f,  -0.98902f,   0.14656f, 
         -0.16666f,  -0.74536f,   0.64550f,  -0.16666f,  -0.74536f,   0.64550f, 
         -0.16666f,  -0.74536f,   0.64550f,   0.00636f,  -0.99822f,   0.05927f, 
         -0.45142f,  -0.74767f,   0.48704f,  -0.45142f,  -0.74767f,   0.48704f, 
         -0.45142f,  -0.74767f,   0.48704f,  -0.45142f,  -0.74767f,   0.48704f, 
         -0.01419f,   0.99131f,   0.13079f,  -0.16666f,   0.74536f,   0.64550f, 
         -0.16666f,   0.74536f,   0.64550f,  -0.16666f,   0.74536f,   0.64550f, 
         -0.16666f,   0.74536f,   0.64550f,  -0.01345f,   0.99165f,   0.12822f, 
          0.00000f,   0.99109f,   0.13317f,   0.00000f,   0.99161f,   0.12928f, 
          0.00000f,   0.84800f,   0.53000f,   0.00000f,   0.84800f,   0.53000f, 
         -0.01278f,   0.99196f,   0.12590f,  -0.16666f,   0.74536f,   0.64550f, 
         -0.16666f,   0.74536f,   0.64550f,  -0.16666f,   0.74536f,   0.64550f, 
         -0.16516f,   0.74344f,   0.64809f,  -0.16516f,   0.74344f,   0.64809f, 
          0.89637f,  -0.08184f,   0.43568f,  -0.16516f,   0.74344f,   0.64809f, 
          0.85458f,   0.31159f,   0.41545f,   0.92177f,  -0.20003f,   0.33215f, 
         -0.16516f,   0.74344f,   0.64809f,   0.10669f,   0.98535f,   0.13305f, 
         -0.16516f,   0.74344f,   0.64809f,  -0.16516f,   0.74344f,   0.64809f, 
          0.89575f,  -0.43733f,   0.07983f,  -0.16516f,   0.74344f,   0.64809f, 
          0.00000f,   0.98058f,   0.19612f,   0.39114f,   0.55220f,   0.73626f, 
         -0.45142f,   0.74767f,   0.48704f,  -0.45142f,   0.74767f,   0.48704f, 
         -0.45142f,   0.74767f,   0.48704f,  -0.45142f,   0.74767f,   0.48704f, 
          0.00000f,   0.00000f,  -1.00000f,   0.00000f,   0.00000f,  -1.00000f, 
          0.00000f,   0.00000f,  -1.00000f,  -0.30324f,  -0.00000f,  -0.95291f, 
         -0.25287f,   0.84290f,  -0.47495f,  -0.36578f,   0.75517f,  -0.54399f, 
         -0.36578f,  -0.75517f,  -0.54399f,  -0.25287f,  -0.84290f,  -0.47495f, 
         -0.00000f,   0.00000f,  -1.00000f,   0.00000f,   0.00000f,  -1.00000f, 
         -0.00000f,   0.00000f,  -1.00000f,  -0.30324f,  -0.00000f,  -0.95291f, 
          0.31143f,   0.00000f,  -0.95027f,   0.00000f,   0.00000f,  -1.00000f, 
          0.00000f,  -0.00000f,  -1.00000f,   0.00000f,  -0.00000f,  -1.00000f, 
          0.36713f,   0.75512f,  -0.54315f,   0.25325f,   0.84418f,  -0.47247f, 
          0.25325f,  -0.84418f,  -0.47247f,   0.36713f,  -0.75512f,  -0.54315f, 
         -0.00000f,   0.00000f,  -1.00000f,   0.00000f,   0.00000f,  -1.00000f, 
          0.31143f,   0.00000f,  -0.95027f,  -0.00000f,   0.00000f,  -1.00000f
    };

    private static final float [] TEXTURE_COORDINATE_DATA = new float [] {
          0.34f,   0.00f,   0.39f,   0.09f,   0.38f,   0.10f, 
          0.16f,   0.00f,   0.12f,   0.10f,   0.11f,   0.09f, 
          0.34f,   0.00f,   0.38f,   0.10f,   0.39f,   0.09f, 
          0.16f,   0.00f,   0.11f,   0.09f,   0.12f,   0.10f, 
          0.34f,   0.00f,   0.39f,   0.09f,   0.42f,   0.08f, 
          0.16f,   0.00f,   0.08f,   0.08f,   0.11f,   0.09f, 
          0.34f,   0.00f,   0.42f,   0.08f,   0.43f,   0.07f, 
          0.16f,   0.00f,   0.07f,   0.07f,   0.08f,   0.08f, 
          0.34f,   0.00f,   0.43f,   0.07f,   0.42f,   0.08f, 
          0.16f,   0.00f,   0.08f,   0.08f,   0.07f,   0.07f, 
          0.42f,   0.08f,   0.39f,   0.09f,   0.34f,   0.00f, 
          0.16f,   0.00f,   0.11f,   0.09f,   0.08f,   0.08f, 
          0.03f,   0.17f,   0.08f,   0.08f,   0.09f,   0.17f, 
          0.08f,   0.08f,   0.11f,   0.09f,   0.09f,   0.17f, 
          0.04f,   0.32f,   0.03f,   0.17f,   0.11f,   0.27f, 
          0.03f,   0.17f,   0.09f,   0.17f,   0.11f,   0.27f, 
          0.00f,   0.17f,   0.07f,   0.07f,   0.03f,   0.17f, 
          0.07f,   0.07f,   0.08f,   0.08f,   0.03f,   0.17f, 
          0.00f,   0.34f,   0.00f,   0.17f,   0.04f,   0.32f, 
          0.00f,   0.17f,   0.03f,   0.17f,   0.04f,   0.32f, 
          0.03f,   0.17f,   0.08f,   0.08f,   0.07f,   0.07f, 
          0.03f,   0.17f,   0.07f,   0.07f,   0.00f,   0.17f, 
          0.04f,   0.32f,   0.03f,   0.17f,   0.00f,   0.17f, 
          0.04f,   0.32f,   0.00f,   0.17f,   0.00f,   0.34f, 
          0.09f,   0.17f,   0.11f,   0.09f,   0.08f,   0.08f, 
          0.09f,   0.17f,   0.08f,   0.08f,   0.03f,   0.17f, 
          0.11f,   0.27f,   0.09f,   0.17f,   0.03f,   0.17f, 
          0.11f,   0.27f,   0.03f,   0.17f,   0.04f,   0.32f, 
          0.12f,   0.17f,   0.12f,   0.10f,   0.11f,   0.09f, 
          0.12f,   0.17f,   0.11f,   0.09f,   0.09f,   0.17f, 
          0.15f,   0.25f,   0.12f,   0.17f,   0.09f,   0.17f, 
          0.15f,   0.25f,   0.09f,   0.17f,   0.11f,   0.27f, 
          0.09f,   0.17f,   0.11f,   0.09f,   0.12f,   0.17f, 
          0.11f,   0.09f,   0.12f,   0.10f,   0.12f,   0.17f, 
          0.11f,   0.27f,   0.09f,   0.17f,   0.15f,   0.25f, 
          0.09f,   0.17f,   0.12f,   0.17f,   0.15f,   0.25f, 
          0.09f,   0.42f,   0.04f,   0.32f,   0.15f,   0.32f, 
          0.04f,   0.32f,   0.11f,   0.27f,   0.15f,   0.32f, 
          0.25f,   0.50f,   0.09f,   0.42f,   0.25f,   0.35f, 
          0.07f,   0.47f,   0.00f,   0.34f,   0.09f,   0.42f, 
          0.00f,   0.34f,   0.04f,   0.32f,   0.09f,   0.42f, 
          0.09f,   0.42f,   0.04f,   0.32f,   0.00f,   0.34f, 
          0.09f,   0.42f,   0.00f,   0.34f,   0.07f,   0.47f, 
          0.15f,   0.32f,   0.11f,   0.27f,   0.04f,   0.32f, 
          0.15f,   0.32f,   0.04f,   0.32f,   0.09f,   0.42f, 
          0.25f,   0.35f,   0.09f,   0.42f,   0.25f,   0.50f, 
          0.17f,   0.27f,   0.15f,   0.25f,   0.11f,   0.27f, 
          0.11f,   0.27f,   0.15f,   0.25f,   0.17f,   0.27f, 
          0.47f,   0.17f,   0.46f,   0.32f,   0.39f,   0.27f, 
          0.47f,   0.17f,   0.39f,   0.27f,   0.41f,   0.17f, 
          0.41f,   0.17f,   0.39f,   0.09f,   0.42f,   0.08f, 
          0.41f,   0.17f,   0.42f,   0.08f,   0.47f,   0.17f, 
          0.50f,   0.17f,   0.50f,   0.34f,   0.46f,   0.32f, 
          0.50f,   0.17f,   0.46f,   0.32f,   0.47f,   0.17f, 
          0.43f,   0.07f,   0.50f,   0.17f,   0.47f,   0.17f, 
          0.43f,   0.07f,   0.47f,   0.17f,   0.42f,   0.08f, 
          0.47f,   0.17f,   0.46f,   0.32f,   0.50f,   0.17f, 
          0.46f,   0.32f,   0.50f,   0.34f,   0.50f,   0.17f, 
          0.42f,   0.08f,   0.47f,   0.17f,   0.43f,   0.07f, 
          0.47f,   0.17f,   0.50f,   0.17f,   0.43f,   0.07f, 
          0.41f,   0.17f,   0.39f,   0.27f,   0.47f,   0.17f, 
          0.39f,   0.27f,   0.46f,   0.32f,   0.47f,   0.17f, 
          0.39f,   0.09f,   0.41f,   0.17f,   0.42f,   0.08f, 
          0.41f,   0.17f,   0.47f,   0.17f,   0.42f,   0.08f, 
          0.38f,   0.17f,   0.35f,   0.25f,   0.41f,   0.17f, 
          0.35f,   0.25f,   0.39f,   0.27f,   0.41f,   0.17f, 
          0.38f,   0.10f,   0.38f,   0.17f,   0.39f,   0.09f, 
          0.38f,   0.17f,   0.41f,   0.17f,   0.39f,   0.09f, 
          0.41f,   0.17f,   0.39f,   0.27f,   0.35f,   0.25f, 
          0.41f,   0.17f,   0.35f,   0.25f,   0.38f,   0.17f, 
          0.39f,   0.09f,   0.41f,   0.17f,   0.38f,   0.17f, 
          0.39f,   0.09f,   0.38f,   0.17f,   0.38f,   0.10f, 
          0.41f,   0.42f,   0.25f,   0.50f,   0.25f,   0.35f, 
          0.46f,   0.32f,   0.41f,   0.42f,   0.36f,   0.32f, 
          0.46f,   0.32f,   0.36f,   0.32f,   0.39f,   0.27f, 
          0.50f,   0.34f,   0.44f,   0.47f,   0.41f,   0.42f, 
          0.50f,   0.34f,   0.41f,   0.42f,   0.46f,   0.32f, 
          0.46f,   0.32f,   0.41f,   0.42f,   0.50f,   0.34f, 
          0.41f,   0.42f,   0.44f,   0.47f,   0.50f,   0.34f, 
          0.25f,   0.35f,   0.25f,   0.50f,   0.41f,   0.42f, 
          0.39f,   0.27f,   0.36f,   0.32f,   0.46f,   0.32f, 
          0.36f,   0.32f,   0.41f,   0.42f,   0.46f,   0.32f, 
          0.35f,   0.25f,   0.33f,   0.27f,   0.39f,   0.27f, 
          0.39f,   0.27f,   0.33f,   0.27f,   0.35f,   0.25f, 
          0.15f,   0.32f,   0.17f,   0.33f,   0.09f,   0.42f, 
          0.17f,   0.33f,   0.20f,   0.34f,   0.09f,   0.42f, 
          0.20f,   0.34f,   0.22f,   0.35f,   0.09f,   0.42f, 
          0.22f,   0.35f,   0.25f,   0.35f,   0.09f,   0.42f, 
          0.25f,   0.35f,   0.22f,   0.35f,   0.09f,   0.42f, 
          0.22f,   0.35f,   0.20f,   0.34f,   0.09f,   0.42f, 
          0.20f,   0.34f,   0.17f,   0.33f,   0.09f,   0.42f, 
          0.17f,   0.33f,   0.15f,   0.32f,   0.09f,   0.42f, 
          0.15f,   0.32f,   0.15f,   0.31f,   0.11f,   0.27f, 
          0.15f,   0.31f,   0.16f,   0.30f,   0.11f,   0.27f, 
          0.16f,   0.30f,   0.17f,   0.29f,   0.11f,   0.27f, 
          0.17f,   0.29f,   0.17f,   0.27f,   0.11f,   0.27f, 
          0.69f,   0.87f,   0.69f,   0.91f,   0.82f,   0.87f, 
          0.69f,   0.91f,   0.70f,   0.93f,   0.82f,   0.87f, 
          0.38f,   0.53f,   0.35f,   0.53f,   0.38f,   0.77f, 
          0.38f,   0.77f,   0.41f,   0.80f,   0.38f,   0.53f, 
          0.41f,   0.64f,   0.38f,   0.53f,   0.41f,   0.80f, 
          0.18f,   0.30f,   0.19f,   0.29f,   0.16f,   0.30f, 
          0.15f,   0.31f,   0.15f,   0.32f,   0.17f,   0.32f, 
          0.17f,   0.32f,   0.18f,   0.30f,   0.15f,   0.31f, 
          0.16f,   0.30f,   0.15f,   0.31f,   0.18f,   0.30f, 
          0.41f,   0.80f,   0.44f,   0.83f,   0.41f,   0.64f, 
          0.17f,   0.29f,   0.16f,   0.30f,   0.19f,   0.29f, 
          0.19f,   0.29f,   0.19f,   0.28f,   0.17f,   0.29f, 
          0.17f,   0.27f,   0.17f,   0.29f,   0.19f,   0.28f, 
          0.35f,   0.75f,   0.38f,   0.77f,   0.35f,   0.53f, 
          0.70f,   0.93f,   0.75f,   0.93f,   0.82f,   0.87f, 
          0.75f,   0.93f,   0.82f,   0.93f,   0.82f,   0.87f, 
          0.66f,   0.25f,   0.61f,   0.21f,   0.59f,   0.03f, 
          0.59f,   0.03f,   0.67f,   0.02f,   0.66f,   0.25f, 
          0.75f,   0.49f,   0.66f,   0.25f,   0.67f,   0.02f, 
          0.22f,   0.33f,   0.20f,   0.32f,   0.20f,   0.34f, 
          0.22f,   0.35f,   0.25f,   0.35f,   0.25f,   0.34f, 
          0.25f,   0.34f,   0.22f,   0.33f,   0.22f,   0.35f, 
          0.20f,   0.34f,   0.22f,   0.35f,   0.22f,   0.33f, 
          0.67f,   0.02f,   0.75f,   0.00f,   0.75f,   0.49f, 
          0.17f,   0.33f,   0.20f,   0.34f,   0.20f,   0.32f, 
          0.20f,   0.32f,   0.17f,   0.32f,   0.17f,   0.33f, 
          0.15f,   0.32f,   0.17f,   0.33f,   0.17f,   0.32f, 
          0.51f,   0.05f,   0.59f,   0.03f,   0.61f,   0.21f, 
          0.17f,   0.27f,   0.17f,   0.29f,   0.11f,   0.27f, 
          0.17f,   0.29f,   0.16f,   0.30f,   0.11f,   0.27f, 
          0.16f,   0.30f,   0.15f,   0.31f,   0.11f,   0.27f, 
          0.15f,   0.31f,   0.15f,   0.32f,   0.11f,   0.27f, 
          0.64f,   0.55f,   0.72f,   0.68f,   0.72f,   0.55f, 
          0.25f,   0.34f,   0.22f,   0.35f,   0.22f,   0.33f, 
          0.20f,   0.34f,   0.22f,   0.33f,   0.22f,   0.35f, 
          0.22f,   0.35f,   0.25f,   0.34f,   0.25f,   0.35f, 
          0.22f,   0.33f,   0.20f,   0.34f,   0.20f,   0.32f, 
          0.55f,   0.56f,   0.66f,   0.68f,   0.64f,   0.55f, 
          0.72f,   0.68f,   0.64f,   0.55f,   0.66f,   0.68f, 
          0.66f,   0.68f,   0.55f,   0.56f,   0.60f,   0.68f, 
          0.72f,   0.68f,   0.66f,   0.68f,   0.72f,   0.79f, 
          0.66f,   0.68f,   0.60f,   0.68f,   0.72f,   0.79f, 
          0.46f,   0.57f,   0.60f,   0.68f,   0.55f,   0.56f, 
          0.20f,   0.32f,   0.17f,   0.33f,   0.17f,   0.32f, 
          0.15f,   0.32f,   0.17f,   0.32f,   0.17f,   0.33f, 
          0.17f,   0.33f,   0.20f,   0.32f,   0.20f,   0.34f, 
          0.48f,   0.62f,   0.60f,   0.68f,   0.46f,   0.57f, 
          0.17f,   0.32f,   0.15f,   0.31f,   0.18f,   0.30f, 
          0.16f,   0.30f,   0.18f,   0.30f,   0.15f,   0.31f, 
          0.15f,   0.31f,   0.17f,   0.32f,   0.15f,   0.32f, 
          0.18f,   0.30f,   0.16f,   0.30f,   0.19f,   0.29f, 
          0.50f,   0.67f,   0.60f,   0.76f,   0.48f,   0.62f, 
          0.60f,   0.68f,   0.48f,   0.62f,   0.60f,   0.76f, 
          0.60f,   0.76f,   0.50f,   0.67f,   0.55f,   0.79f, 
          0.60f,   0.68f,   0.60f,   0.76f,   0.72f,   0.79f, 
          0.60f,   0.76f,   0.55f,   0.79f,   0.72f,   0.79f, 
          0.18f,   0.75f,   0.18f,   0.53f,   0.21f,   0.78f, 
          0.19f,   0.29f,   0.17f,   0.29f,   0.19f,   0.28f, 
          0.17f,   0.27f,   0.19f,   0.28f,   0.17f,   0.29f, 
          0.17f,   0.29f,   0.19f,   0.29f,   0.16f,   0.30f, 
          0.25f,   0.35f,   0.28f,   0.34f,   0.41f,   0.42f, 
          0.28f,   0.34f,   0.30f,   0.34f,   0.41f,   0.42f, 
          0.30f,   0.34f,   0.33f,   0.33f,   0.41f,   0.42f, 
          0.33f,   0.33f,   0.36f,   0.32f,   0.41f,   0.42f, 
          0.36f,   0.32f,   0.33f,   0.33f,   0.41f,   0.42f, 
          0.33f,   0.33f,   0.30f,   0.34f,   0.41f,   0.42f, 
          0.30f,   0.34f,   0.28f,   0.34f,   0.41f,   0.42f, 
          0.28f,   0.34f,   0.25f,   0.35f,   0.41f,   0.42f, 
          0.32f,   0.29f,   0.34f,   0.30f,   0.34f,   0.28f, 
          0.34f,   0.28f,   0.31f,   0.28f,   0.32f,   0.29f, 
          0.18f,   0.53f,   0.15f,   0.78f,   0.18f,   0.75f, 
          0.31f,   0.28f,   0.34f,   0.28f,   0.33f,   0.27f, 
          0.15f,   0.78f,   0.18f,   0.53f,   0.14f,   0.53f, 
          0.14f,   0.53f,   0.12f,   0.80f,   0.15f,   0.78f, 
          0.34f,   0.30f,   0.32f,   0.29f,   0.32f,   0.30f, 
          0.12f,   0.80f,   0.14f,   0.53f,   0.12f,   0.65f, 
          0.33f,   0.31f,   0.36f,   0.32f,   0.35f,   0.31f, 
          0.35f,   0.31f,   0.32f,   0.30f,   0.33f,   0.31f, 
          0.12f,   0.65f,   0.09f,   0.83f,   0.12f,   0.80f, 
          0.32f,   0.30f,   0.35f,   0.31f,   0.34f,   0.30f, 
          0.93f,   0.93f,   0.95f,   0.91f,   0.82f,   0.87f, 
          0.95f,   0.91f,   0.95f,   0.87f,   0.82f,   0.87f, 
          0.82f,   0.93f,   0.89f,   0.93f,   0.82f,   0.87f, 
          0.89f,   0.93f,   0.93f,   0.93f,   0.82f,   0.87f, 
          0.83f,   0.25f,   0.75f,   0.49f,   0.83f,   0.02f, 
          0.83f,   0.02f,   0.91f,   0.03f,   0.83f,   0.25f, 
          0.89f,   0.21f,   0.83f,   0.25f,   0.91f,   0.03f, 
          0.30f,   0.32f,   0.28f,   0.33f,   0.30f,   0.34f, 
          0.33f,   0.33f,   0.36f,   0.32f,   0.33f,   0.31f, 
          0.33f,   0.31f,   0.30f,   0.32f,   0.33f,   0.33f, 
          0.30f,   0.34f,   0.33f,   0.33f,   0.30f,   0.32f, 
          0.91f,   0.03f,   0.99f,   0.05f,   0.89f,   0.21f, 
          0.28f,   0.34f,   0.30f,   0.34f,   0.28f,   0.33f, 
          0.28f,   0.33f,   0.25f,   0.34f,   0.28f,   0.34f, 
          0.25f,   0.35f,   0.28f,   0.34f,   0.25f,   0.34f, 
          0.75f,   0.00f,   0.83f,   0.02f,   0.75f,   0.49f, 
          0.33f,   0.27f,   0.34f,   0.28f,   0.39f,   0.27f, 
          0.34f,   0.28f,   0.34f,   0.30f,   0.39f,   0.27f, 
          0.34f,   0.30f,   0.35f,   0.31f,   0.39f,   0.27f, 
          0.35f,   0.31f,   0.36f,   0.32f,   0.39f,   0.27f, 
          0.90f,   0.56f,   0.85f,   0.68f,   0.99f,   0.57f, 
          0.33f,   0.31f,   0.33f,   0.33f,   0.30f,   0.32f, 
          0.30f,   0.34f,   0.30f,   0.32f,   0.33f,   0.33f, 
          0.33f,   0.33f,   0.33f,   0.31f,   0.36f,   0.32f, 
          0.30f,   0.32f,   0.30f,   0.34f,   0.28f,   0.33f, 
          0.81f,   0.55f,   0.79f,   0.68f,   0.90f,   0.56f, 
          0.85f,   0.68f,   0.90f,   0.56f,   0.79f,   0.68f, 
          0.79f,   0.68f,   0.81f,   0.55f,   0.72f,   0.68f, 
          0.85f,   0.68f,   0.79f,   0.68f,   0.72f,   0.79f, 
          0.79f,   0.68f,   0.72f,   0.68f,   0.72f,   0.79f, 
          0.72f,   0.55f,   0.72f,   0.68f,   0.81f,   0.55f, 
          0.28f,   0.33f,   0.28f,   0.34f,   0.25f,   0.34f, 
          0.25f,   0.35f,   0.25f,   0.34f,   0.28f,   0.34f, 
          0.28f,   0.34f,   0.28f,   0.33f,   0.30f,   0.34f, 
          0.32f,   0.30f,   0.34f,   0.30f,   0.35f,   0.31f, 
          0.35f,   0.31f,   0.33f,   0.31f,   0.32f,   0.30f, 
          0.85f,   0.68f,   0.97f,   0.62f,   0.99f,   0.57f, 
          0.33f,   0.31f,   0.35f,   0.31f,   0.36f,   0.32f, 
          0.97f,   0.62f,   0.85f,   0.68f,   0.85f,   0.76f, 
          0.85f,   0.76f,   0.95f,   0.67f,   0.97f,   0.62f, 
          0.34f,   0.30f,   0.32f,   0.30f,   0.32f,   0.29f, 
          0.95f,   0.67f,   0.85f,   0.76f,   0.90f,   0.79f, 
          0.31f,   0.28f,   0.33f,   0.27f,   0.34f,   0.28f, 
          0.34f,   0.28f,   0.32f,   0.29f,   0.31f,   0.28f, 
          0.35f,   0.53f,   0.35f,   0.75f,   0.32f,   0.77f, 
          0.32f,   0.29f,   0.34f,   0.28f,   0.34f,   0.30f, 
          0.90f,   0.79f,   0.85f,   0.76f,   0.72f,   0.79f, 
          0.85f,   0.76f,   0.85f,   0.68f,   0.72f,   0.79f, 
          0.36f,   0.32f,   0.35f,   0.31f,   0.39f,   0.27f, 
          0.35f,   0.31f,   0.34f,   0.30f,   0.39f,   0.27f, 
          0.34f,   0.30f,   0.34f,   0.28f,   0.39f,   0.27f, 
          0.34f,   0.28f,   0.33f,   0.27f,   0.39f,   0.27f, 
          0.32f,   0.95f,   0.32f,   0.91f,   0.16f,   0.91f, 
          0.16f,   0.91f,   0.16f,   0.95f,   0.32f,   0.95f, 
          0.32f,   1.00f,   0.32f,   0.95f,   0.16f,   0.95f, 
          0.16f,   0.95f,   0.16f,   0.91f,   0.00f,   0.91f, 
          0.25f,   0.50f,   0.16f,   0.50f,   0.09f,   0.42f, 
          0.16f,   0.50f,   0.07f,   0.47f,   0.09f,   0.42f, 
          0.07f,   0.47f,   0.16f,   0.50f,   0.09f,   0.42f, 
          0.16f,   0.50f,   0.25f,   0.50f,   0.09f,   0.42f, 
          0.32f,   0.87f,   0.32f,   0.82f,   0.16f,   0.87f, 
          0.16f,   0.87f,   0.16f,   0.91f,   0.32f,   0.87f, 
          0.32f,   0.91f,   0.32f,   0.87f,   0.16f,   0.91f, 
          0.16f,   0.91f,   0.16f,   0.87f,   0.00f,   0.91f, 
          0.48f,   0.95f,   0.64f,   0.91f,   0.48f,   0.91f, 
          0.48f,   0.91f,   0.32f,   0.95f,   0.48f,   0.95f, 
          0.32f,   1.00f,   0.48f,   0.95f,   0.32f,   0.95f, 
          0.32f,   0.95f,   0.48f,   0.91f,   0.32f,   0.91f, 
          0.44f,   0.47f,   0.34f,   0.50f,   0.41f,   0.42f, 
          0.34f,   0.50f,   0.25f,   0.50f,   0.41f,   0.42f, 
          0.25f,   0.50f,   0.34f,   0.50f,   0.41f,   0.42f, 
          0.34f,   0.50f,   0.44f,   0.47f,   0.41f,   0.42f, 
          0.48f,   0.87f,   0.32f,   0.82f,   0.32f,   0.87f, 
          0.32f,   0.87f,   0.48f,   0.91f,   0.48f,   0.87f, 
          0.64f,   0.91f,   0.48f,   0.87f,   0.48f,   0.91f, 
          0.48f,   0.91f,   0.32f,   0.87f,   0.32f,   0.91f
    };

    public Lyre(Alite alite) {
        super(alite, "Lyre", ObjectType.EnemyShip);
        shipType = ShipType.Lyre;
        boundingBox = new float [] {-140.00f, 140.00f, -28.71f,  28.71f, -133.42f, 133.42f};
        numberOfVertices = 756;
        textureFilename = "textures/tiger.png";
        maxSpeed          = 434.2f;
        maxPitchSpeed     = 2.500f;
        maxRollSpeed      = 3.000f;
        hullStrength      = 240.0f;
        hasEcm            = true;
        cargoType         = 14;
        aggressionLevel   = 10;
        escapeCapsuleCaps = 1;
        bounty            = 200;
        score             = 240;
        legalityType      = 1;
        maxCargoCanisters = 3;
        laserHardpoints.add(VERTEX_DATA[0]);
        laserHardpoints.add(VERTEX_DATA[1]);
        laserHardpoints.add(VERTEX_DATA[2]);
        laserHardpoints.add(VERTEX_DATA[9]);
        laserHardpoints.add(VERTEX_DATA[10]);
        laserHardpoints.add(VERTEX_DATA[11]);
        laserColor        = 0x7FFFFF00l;
        init();
    }

    @Override
    protected void init() {
        vertexBuffer = createReversedRotatedFaces(VERTEX_DATA, NORMAL_DATA,
                                    0,   1,   2,   3,   4,   5,   0,   2,   6,   3,   7,   4,   0,   6,   8, 
                                    3,   9,   7,   0,   8,  10,   3,  11,   9,   0,  10,  12,   3,  13,  11, 
                                   12,   1,   0,   3,   5,  13,  14,  13,  15,  13,   5,  15,  16,  14,  17, 
                                   14,  15,  17,  18,  11,  14,  11,  13,  14,  19,  18,  16,  18,  14,  16, 
                                   20,   9,  11,  20,  11,  18,  21,  20,  18,  21,  18,  19,  22,   7,   9, 
                                   22,   9,  20,  23,  22,  20,  23,  20,  21,  24,   4,   7,  24,   7,  22, 
                                   25,  24,  22,  25,  22,  23,  15,   5,  24,   5,   4,  24,  17,  15,  25, 
                                   15,  24,  25,  26,  16,  27,  16,  17,  27,  28,  26,  29,  30,  19,  26, 
                                   19,  16,  26,  31,  21,  19,  31,  19,  30,  32,  23,  21,  32,  21,  31, 
                                   33,  31,  34,  35,  25,  23,  17,  25,  35,  36,  37,  38,  36,  38,  39, 
                                   39,   1,  12,  39,  12,  36,  40,  41,  37,  40,  37,  36,  10,  40,  36, 
                                   10,  36,  12,  42,  43,  40,  43,  41,  40,   8,  42,  10,  42,  40,  10, 
                                   44,  45,  42,  45,  43,  42,   6,  44,   8,  44,  42,   8,  46,  47,  44, 
                                   47,  45,  44,   2,  46,   6,  46,  44,   6,  39,  38,  47,  39,  47,  46, 
                                    1,  39,  46,   1,  46,   2,  48,  28,  29,  37,  48,  49,  37,  49,  38, 
                                   41,  50,  48,  41,  48,  37,  43,  51,  41,  51,  50,  41,  33,  34,  51, 
                                   45,  52,  43,  52,  51,  43,  47,  53,  45,  38,  53,  47,  27,  54,  26, 
                                   54,  55,  26,  55,  56,  26,  56,  29,  26,  33,  57,  31,  57,  58,  31, 
                                   58,  59,  31,  59,  32,  31,  32,  60,  23,  60,  61,  23,  61,  62,  23, 
                                   62,  35,  23,  63,  64,  65,  64,  66,  65,  64,  63,  67,  67,  68,  64, 
                                   66,  64,  68,  68,  67,  61,  60,  32,  69,  69,  68,  60,  61,  60,  68, 
                                   68,  69,  66,  62,  61,  67,  67,  70,  62,  35,  62,  70,  70,  67,  63, 
                                   66,  71,  65,  71,  72,  65,  71,  66,  73,  73,  74,  71,  72,  71,  74, 
                                   74,  73,  58,  57,  33,  75,  75,  74,  57,  58,  57,  74,  74,  75,  72, 
                                   59,  58,  73,  73,  69,  59,  32,  59,  69,  69,  73,  66,  35,  76,  17, 
                                   76,  77,  17,  77,  78,  17,  78,  27,  17,  79,  80,  81,  81,  56,  79, 
                                   55,  79,  56,  56,  81,  29,  79,  55,  82,  82,  83,  79,  80,  79,  83, 
                                   83,  82,  84,  80,  83,  65,  83,  84,  65,  85,  84,  82,  82,  54,  85, 
                                   27,  85,  54,  54,  82,  55,  86,  84,  85,  85,  78,  86,  77,  86,  78, 
                                   78,  85,  27,  86,  77,  87,  87,  88,  86,  84,  86,  88,  88,  87,  63, 
                                   84,  88,  65,  88,  63,  65,  70,  63,  87,  87,  76,  70,  35,  70,  76, 
                                   76,  87,  77,  29,  89,  48,  89,  90,  48,  90,  91,  48,  91,  49,  48, 
                                   52,  92,  51,  92,  93,  51,  93,  94,  51,  94,  33,  51,  95,  96,  97, 
                                   97,  98,  95,  99,  95,  98,  98,  97,  53,  95,  99, 100, 100, 101,  95, 
                                   96,  95, 101, 101, 100, 102, 103,  52, 104, 104, 101, 103, 102, 103, 101, 
                                  101, 104,  96, 102, 100,  65, 100,  99,  65,  72, 105,  65, 105, 102,  65, 
                                  105,  72, 106, 106, 107, 105, 102, 105, 107, 107, 106,  93,  92,  52, 103, 
                                  103, 107,  92,  93,  92, 107, 107, 103, 102,  94,  93, 106, 106,  75,  94, 
                                   33,  94,  75,  75, 106,  72,  53,  97,  45,  97,  96,  45,  96, 104,  45, 
                                  104,  52,  45, 108, 109, 110, 110,  91, 108,  90, 108,  91,  91, 110,  49, 
                                  108,  90, 111, 111, 112, 108, 109, 108, 112, 112, 111,  80, 109, 112,  65, 
                                  112,  80,  65,  81,  80, 111, 111,  89,  81,  29,  81,  89,  89, 111,  90, 
                                  113, 114, 115, 115, 110, 113, 109, 113, 110, 110, 115,  49, 113, 109, 116, 
                                  116, 117, 113, 114, 113, 117, 117, 116,  99,  98,  53, 118, 118, 117,  98, 
                                   99,  98, 117, 117, 118, 114,  99, 116,  65, 116, 109,  65,  49, 115,  38, 
                                  115, 114,  38, 114, 118,  38, 118,  53,  38, 119, 120, 121, 121, 122, 119, 
                                   28, 119, 122, 122, 121,  30,  28, 122,  26, 122,  30,  26,  30, 123,  31, 
                                  123,  34,  31, 124,  34, 123, 123, 121, 124, 120, 124, 121, 121, 123,  30, 
                                  125,  50, 126, 126, 119, 125,  28, 125, 119, 119, 126, 120,  50, 125,  48, 
                                  125,  28,  48,  34, 127,  51, 127,  50,  51, 127,  34, 124, 124, 126, 127, 
                                   50, 127, 126, 126, 124, 120);
        texCoordBuffer = GlUtils.toFloatBufferPositionZero(TEXTURE_COORDINATE_DATA);
        alite.getTextureManager().addTexture(textureFilename);
        if (Settings.engineExhaust) {
        	addExhaust(new EngineExhaust(this, 13, 13, 30, -35, 0, 0, 0.86f, 0.18f, 0.7f, 0.7f));
        	addExhaust(new EngineExhaust(this, 13, 13, 30,  35, 0, 0, 0.86f, 0.18f, 0.7f, 0.7f));        	
        }
        initTargetBox();
    }

    @Override
    public boolean isVisibleOnHud() {
        return true;
    }

    @Override
    public Vector3f getHudColor() {
        return HUD_COLOR;
    }

    @Override
    public float getDistanceFromCenterToBorder(Vector3f dir) {
        return 50.0f;
    }
}
