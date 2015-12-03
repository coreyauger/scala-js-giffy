package im.conversant.apps.giffy

import scala.scalajs.js
import js.annotation._
import org.scalajs.dom._

@js.native
trait Image extends js.Object {
  val mp4:  String = js.native
  val size:  String = js.native
  val frames:  String = js.native
  val width:  String = js.native
  val mp4_size:  String = js.native
  val webp:  String = js.native
  val webp_size:  String = js.native
  val url:  String = js.native
  val height:  String = js.native
}

object Image {
  def apply(
      mp4: js.UndefOr[String] = js.undefined,
      size: js.UndefOr[String]  = js.undefined,
      frames: js.UndefOr[String]  = js.undefined,
      width: js.UndefOr[String]  = js.undefined,
      mp4_size: js.UndefOr[String]  = js.undefined,
      webp: js.UndefOr[String]  = js.undefined,
      webp_size: js.UndefOr[String]  = js.undefined,
      url: js.UndefOr[String]  = js.undefined,
      height: js.UndefOr[String]  = js.undefined
      ): Image = {
    val result = js.Dynamic.literal()
    mp4.foreach(result.mp4 = _)
    size.foreach(result.size = _)
    frames.foreach(result.frames = _)
    width.foreach(result.width = _)
    mp4_size.foreach(result.mp4_size = _)
    webp.foreach(result.webp = _)
    webp_size.foreach(result.webp_size = _)
    url.foreach(result.url = _)
    height.foreach(result.height = _)
    result.asInstanceOf[Image]
  }
}

@js.native
trait Images extends js.Object {
  val original:  Image = js.native
  val fixed_height_small:  Image = js.native
  val looping:  Image = js.native
  val fixed_width:  Image = js.native
  val downsized_still:  Image = js.native
  val downsized_large:  Image = js.native
  val fixed_height_downsampled:  Image = js.native
  val fixed_height:  Image = js.native
  val fixed_width_downsampled:  Image = js.native
  val fixed_height_small_still:  Image = js.native
  val fixed_width_small:  Image = js.native
  val fixed_height_still:  Image = js.native
  val fixed_width_small_still:  Image = js.native
  val fixed_width_still:  Image = js.native
  val downsized:  Image = js.native
  val original_still:  Image = js.native
}

object Images {
  def apply(
      original:  js.UndefOr[Image] = js.undefined,
      fixed_height_small:  js.UndefOr[Image]  = js.undefined,
      looping:  js.UndefOr[Image]  = js.undefined,
      fixed_width:  js.UndefOr[Image]  = js.undefined,
      downsized_still:  js.UndefOr[Image]  = js.undefined,
      downsized_large:  js.UndefOr[Image]  = js.undefined,
      fixed_height_downsampled:  js.UndefOr[Image]  = js.undefined,
      fixed_height:  js.UndefOr[Image]  = js.undefined,
      fixed_width_downsampled:  js.UndefOr[Image]  = js.undefined,
      fixed_height_small_still:  js.UndefOr[Image]  = js.undefined,
      fixed_width_small:  js.UndefOr[Image]  = js.undefined,
      fixed_height_still:  js.UndefOr[Image]  = js.undefined,
      fixed_width_small_still:  js.UndefOr[Image]  = js.undefined,
      fixed_width_still:  js.UndefOr[Image]  = js.undefined,
      downsized:  js.UndefOr[Image]  = js.undefined,
      original_still:  js.UndefOr[Image]  = js.undefined
      ): Images = {
    val result = js.Dynamic.literal()
    original.foreach(result.original = _)
    fixed_height_small.foreach(result.fixed_height_small = _)
    looping.foreach(result.looping = _)
    fixed_width.foreach(result.fixed_width = _)
    downsized_still.foreach(result.downsized_still = _)
    downsized_large.foreach(result.downsized_large = _)
    fixed_height_downsampled.foreach(result.fixed_height_downsampled = _)
    fixed_height.foreach(result.fixed_height = _)
    fixed_width_downsampled.foreach(result.fixed_width_downsampled = _)
    fixed_height_small_still.foreach(result.fixed_height_small_still = _)
    fixed_width_small.foreach(result.fixed_width_small = _)
    fixed_height_still.foreach(result.fixed_height_still = _)
    fixed_width_small_still.foreach(result.fixed_width_small_still = _)
    fixed_width_still.foreach(result.fixed_width_still = _)
    downsized.foreach(result.downsized = _)
    original_still.foreach(result.original_still = _)
    result.asInstanceOf[Images]
  }
}

@js.native
trait Giffy extends js.Object {
  val `type`:  String = js.native
  val id:  String = js.native
  val url:  String = js.native
  val bitly_gif_url:  String = js.native
  val bitly_url:  String = js.native
  val embed_url:  String = js.native
  val username:  String = js.native
  val source:  String = js.native
  val rating:  String = js.native
  val content_url:  String = js.native
  val source_tld:  String = js.native
  val source_post_url:  String = js.native
  val import_datetime:  String = js.native
  val trending_datetime:  String = js.native
  val images: Images = js.native
}

object Giffy {
  def apply(
      `type`:  js.UndefOr[String] = js.undefined,
      id:  js.UndefOr[String]  = js.undefined,
      url:  js.UndefOr[String]  = js.undefined,
      bitly_gif_url:  js.UndefOr[String]  = js.undefined,
      bitly_url:  js.UndefOr[String]  = js.undefined,
      embed_url:  js.UndefOr[String]  = js.undefined,
      username:  js.UndefOr[String]  = js.undefined,
      source:  js.UndefOr[String]  = js.undefined,
      rating:  js.UndefOr[String]  = js.undefined,
      content_url:  js.UndefOr[String]  = js.undefined,
      source_tld:  js.UndefOr[String]  = js.undefined,
      source_post_url:  js.UndefOr[String]  = js.undefined,
      import_datetime:  js.UndefOr[String]  = js.undefined,
      trending_datetime:  js.UndefOr[String]  = js.undefined
      ): Giffy = {
    val result = js.Dynamic.literal()
    `type`.foreach(result.`type` = _)
    id.foreach(result.id = _)
    url.foreach(result.url = _)
    bitly_gif_url.foreach(result.bitly_gif_url = _)
    bitly_url.foreach(result.bitly_url = _)
    embed_url.foreach(result.embed_url = _)
    username.foreach(result.username = _)
    source.foreach(result.source = _)
    rating.foreach(result.rating = _)
    content_url.foreach(result.content_url = _)
    source_tld.foreach(result.source_tld = _)
    source_post_url.foreach(result.source_post_url = _)
    import_datetime.foreach(result.import_datetime = _)
    trending_datetime.foreach(result.trending_datetime = _)
    result.asInstanceOf[Giffy]
  }
}

@js.native
trait GiffyData extends js.Object {
  var data:js.Array[Giffy] = js.native

}

object GiffyData {
  def apply(
             data:js.UndefOr[js.Array[Giffy]] = js.undefined
             ): GiffyData = {
    val result = js.Dynamic.literal()
    data.foreach(result.data = _)
    result.asInstanceOf[GiffyData]
  }
}









