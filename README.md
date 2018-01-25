## imagesliderview-android

The library helps you add an image slider to your android application.
 
In order to use the sliderview in your app,add the following dependency in the build.gradle of your app module : <br>
compile 'com.oodles:imagesliderview:1.0'

<p>
You can declare the SliderViewLayout in your activity layout file like :
    <br>
    < com.example.imagesliderview.Views.SliderViewLayout <br>
        android:id="@+id/sliderLayout" <br>
        android:layout_width="match_parent" <br>
        android:layout_height="300dp"/> <br>
</p> 

<p>
You can declare the following attributes for your SliderViewLayout:
<ul>
<li>showIndicator(boolean) : It decides whether to show indicators at the bottom of the imageview for the active/inactive images.Default value is true.</li>
<li>indicatorSize(dimension) : It sets the size for the indicators in dp.Default value is 10.</li>
<li>infiniteview(boolean) : It decides whether to loop through the images provided by the user automatically.Default value is true.</li>
<li>timeInterval(integer) : It lets you set the time interval(in milliseconds) for which each image is shown in the image slider in case infiniteview is enabled.Default value is 2000ms</li>
<li>showarrow(boolean) : It decides whether to show navigation arrows on either side of the image.Default value is false.</li>
<li></li>
</ul>
</p>

<p>
The SliderViewLayout provides the following setter methods:
<ul>
<li>setSliderImages(ArrayList<SliderImage> imageList,int placeholder) : This method lets you add a list of images to be set in the sliderviewlayout along with an int value for the placeholder resource(specify 0,if you want to use the default placeholder).The ArrayList could be either an Arraylist of UrlImage objects in case of remote images or DrawableImage in case of local images as they both extend SliderImage.</li>
<li>setCustomIndicators(Drawable selected,Drawable unselected) : This method lets you add custom indicator shapes for the selected and unselected indicators in the sliderview.</li>
<li>setCustomArrows(int leftArrow,int rightArrow) : This method lets you add custom navigation arrows to your sliderview by specifying the int resources for the left and right arrow respectively.</li>
</ul>
</p>
<p>This library uses the glide library from bumptech to display and cache images</p>
